/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2011, Open Source Geospatial Foundation (OSGeo)
 *    (C) 2003-2005, Open Geospatial Consortium Inc.
 *
 *    All Rights Reserved. http://www.opengis.org/legal/
 */
package org.opengis.referencing.datum;

import static org.opengis.annotation.Obligation.*;
import static org.opengis.annotation.Specification.*;

import javax.measure.Unit;
import javax.measure.quantity.Length;
import org.opengis.annotation.UML;
import org.opengis.referencing.IdentifiedObject;

/**
 * 定义椭球体几何图形，可用于描述地球的近似形状。在数学上，
 * 它是由椭圆绕其短轴旋转形成的表面。椭球需要两个定义参数：
 *
 * <p>
 *
 * <ul>
 *   <li>{@linkplain #getSemiMajorAxis semi-major axis} and {@linkplain #getInverseFlattening
 *       inverse flattening}, or
 *   <li>{@linkplain #getSemiMajorAxis semi-major axis} and {@linkplain #getSemiMinorAxis semi-minor
 *       axis}.
 * </ul>
 *
 * <p>不只有一个椭球体。椭球是一个选择问题，因此许多选择是可能的。
 *  例如，在一个国家,传统上选择椭圆体的尺寸和形状，使得大地水准面的表面尽可能地局部匹配。现在有许多全球最佳拟合椭球体。
 *  椭球体与地球的关联是通过椭球体的大小和形状以及该椭球体相对于地球的位置和方向的定义来实现的。
 *  总的来说，这个选择被"{@linkplain GeodeticDatum geodetic datum}"的概念所捕获。
 *  椭球体的大小，形状，位置或方向的改变将导致点的地理坐标的改变并且被描述为不同的大地测量数据。
 *  相反，地理坐标仅在与大地测量数据相关联时才是明确的。
 *
 *
 *
 * @departure ISO 19111 defines {@link #getSemiMinorAxis semiMinorAxis}, {@link
 *     #getInverseFlattening inverseFlattening} and {@link #isIvfDefinitive isSphere} in a separated
 *     structure named {@code secondDefiningParameter} of type {@code union}. The C/C++ concept of
 *     {@code union} doesn't exist in Java, but implementors can achieve the same functionality by
 *     providing different {@code Ellipsoid} subclasses computing one parameter on-the-fly from the
 *     other one. The {@link #isIvfDefinitive isIvfDefinitive} attribute imported from OGC 01-004
 *     can be used for distinguishing between the two cases.
 * @version <A HREF="http://portal.opengeospatial.org/files/?artifact_id=6716">Abstract
 *     specification 2.0</A>
 * @author Martin Desruisseaux (IRD)
 * @since GeoAPI 1.0
 */
@UML(identifier = "CD_Ellipsoid", specification = ISO_19111)
public interface Ellipsoid extends IdentifiedObject {
    /**
     * 返回{@linkplain #getSemiMajorAxis semi-major}和
     * {@linkplain #getSemiMinorAxis semi-minor}轴值的线性单位。
     *
     * @return 轴线性单元。
     */
    @UML(identifier = "getAxisUnit", specification = OGC_01009)
    Unit<Length> getAxisUnit();

    /**
     * 椭球体的长半轴的长度。
     * 这是{@linkplain #getAxisUnit 轴线性单位}中的赤道半径。
     *
     * @return 长半轴的长度
     * @unitof Length
     */
    @UML(identifier = "semiMajorAxis", obligation = MANDATORY, specification = ISO_19111)
    double getSemiMajorAxis();

    /**
     * 椭球体的短半轴的长度。
     * 这是{@linkplain #getAxisUnit 轴线性单位}中的极半径。
     *
     * @return 短半轴的长度
     * @unitof Length
     */
    @UML(
        identifier = "secondDefiningParameter.semiMinorAxis",
        obligation = CONDITIONAL,
        specification = ISO_19111
    )
    double getSemiMinorAxis();

    /**
     *返回椭球的扁率的倒数
     * Returns the value of the inverse of the flattening constant.
     * 椭球扁率计算公式与赤道/极半径相关
     *
     * <p><var>ivf</var>&nbsp;=&nbsp;<var>r</var><sub>e</sub>/(<var>r</var><sub>e</sub>-<var>r</var><sub>p</sub>).
     *
     * <p>For perfect spheres (i.e. if {@link #isSphere} returns {@code true}), the {@link
     * Double#POSITIVE_INFINITY POSITIVE_INFINITY} value is used.
     *
     * @return 椭球的扁率的倒数
     * @unitof Scale
     */
    @UML(
        identifier = "secondDefiningParameter.inverseFlattening",
        obligation = CONDITIONAL,
        specification = ISO_19111
    )
    double getInverseFlattening();

    /**
     * 指示椭球体是否以{@linkplain #getInverseFlattening 扁率的倒数 }来确定的。
     * 一些椭圆体使用IVF作为定义值，并在需要时计算极半径。
     * 其他椭圆体使用极半径来计算IVF。
     * 这种区别对于避免浮点舍入误差非常重要。
     *
     * @return 如果椭球体是以 {@linkplain  #getInverseFlattening 扁率的倒数 }来确定的，返回{@code true}，否则返回 {@code false}
     */
    @UML(
        identifier = "CS_Ellipsoid.isIvfDefinitive",
        obligation = CONDITIONAL,
        specification = OGC_01009
    )
    boolean isIvfDefinitive();

    /**
     * 如果椭圆体是退化的并且实际上是一个球体，则返回 {@code true}
     * 这里的球体完全由{@linkplain #getSemiMajorAxis 半长轴}定义，它是球体的半径。
     *
     * @return {@code true} 如果椭圆体是退化的并且实际上是一个球体。
     */
    @UML(
        identifier = "secondDefiningParameter.isSphere",
        obligation = CONDITIONAL,
        specification = ISO_19111
    )
    boolean isSphere();
}
