/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2011, Open Source Geospatial Foundation (OSGeo)
 *    (C) 2003-2005, Open Geospatial Consortium Inc.
 *
 *    All Rights Reserved. http://www.opengis.org/legal/
 */
package org.opengis.referencing;

import static org.opengis.annotation.Obligation.*;
import static org.opengis.annotation.Specification.*;

import java.util.Collection;
import java.util.Set;
import org.opengis.annotation.Extension;
import org.opengis.annotation.UML;
import org.opengis.util.GenericName;
import org.opengis.util.InternationalString;

/**
 * CRS或CRS相关对象的补充标识和备注信息。
 * 使用{@link org.opengis.referencing.crs.CRSAuthorityFactory}创建对象时，
 * 应将{@linkplain ReferenceIdentifier#getAuthority authority }和{@linkplain ReferenceIdentifier#getCode authority code}
 * 值设置为权限工厂对象的名称和客户端提供的权限代码。
 * 可以设置或不设置其他值。如果权限是EPSG，则实现者可以考虑使用EPSG表中的相应元数据值。
 *
 * @departure ISO 19111还定义了{@code IdentifiedObjectBase}接口。
 *            在GeoAPI中省略了后者，因为OGC/ISO规范中{@code IdentifiedObject}和{@code IdentifiedObjectBase}
 *            之间的拆分主要是在ISO 19111中引入{@code IdentifiedObject}
 *            而不更改{@code ReferenceSystem的解决方法ISO 19115中的定义。
 * @version <A HREF="http://portal.opengeospatial.org/files/?artifact_id=6716">抽象规范2.0 </A>
 * @author Martin Desruisseaux (IRD)
 * @since GeoAPI 2.0
 */
@UML(identifier = "IO_IdentifiedObject", specification = ISO_19111)
public interface IdentifiedObject {
    /**
     * 名称
     * 将<code>{@value}</code>属性的键赋予{@linkplain ObjectFactory object factory}
     * <code>createFoo(&hellip;)</code>方法。这用于设置{@link #getName}返回的值。
     *
     * @see #getName
     */
    String NAME_KEY = "name";

    /**
     * 别名
     * 将<code>{@value}</code>属性的键赋予{@linkplain ObjectFactory object factory}
     * <code>createFoo(&hellip;)</code>方法。这用于设置{@link #getAlias}返回的值*。
     *
     * @see #getAlias
     */
    String ALIAS_KEY = "alias";

    /**
     * 将<code>{@value}</code>属性的键赋予{@linkplain ObjectFactory object factory}
     * <code>createFoo(&hellip;)</code>方法。这用于设置{@link #getIdentifiers}返回的值*。
     *
     * @see #getIdentifiers
     */
    String IDENTIFIERS_KEY = "identifiers";

    /**
     *将<code>{@value}</code>属性的键赋予{@linkplain ObjectFactory object factory}
     * <code>createFoo(＆hellip;)</code>方法。这用于设置{@link #getRemarks}返回的值*。
     *
     * @see #getRemarks
     */
    String REMARKS_KEY = "remarks";

    /**
     * 标识此对象的主要名称。
     *
     * @return 主要名称。
     */
    @UML(identifier = "name", obligation = MANDATORY, specification = ISO_19111)
    ReferenceIdentifier getName();

    /**
     * 标识此对象的备用名称。
     *
     * @return 别名，如果没有，则为空集合。
     */
    @UML(identifier = "alias", obligation = OPTIONAL, specification = ISO_19111)
    Collection<GenericName> getAlias();

    /**
     * 一个标识符，用于引用对象的定义信息。或者是一个标识符，它可以通过该标识符引用此对象。
     *
     * @return 此对象标识符，如果没有，则为空集。
     */
    @UML(identifier = "identifier", obligation = OPTIONAL, specification = ISO_19111)
    Set<ReferenceIdentifier> getIdentifiers();

    /**
     * 有关此对象的注释或信息，包括数据源信息。
     *
     * @return The remarks, or {@code null} if none.
     */
    @UML(identifier = "remarks", obligation = OPTIONAL, specification = ISO_19111)
    InternationalString getRemarks();

    /**
     * 返回 <A HREF="doc-files/WKT.html"><cite>坐标参考对象的WKT形式</cite> (WKT)</A>
     * 如果对象对于WKT格式功能而言过于复杂，则此操作可能会失败
     * （例如{@linkplain org.opengis.referencing.crs.EngineeringCRS engineering CRS}，每个轴具有不同的单位）。
     *
     * @return 这个对象的Well Know Text。
     * @throws UnsupportedOperationException 如果此对象无法格式化为WKT。
     */
    @Extension
    String toWKT() throws UnsupportedOperationException;
}
