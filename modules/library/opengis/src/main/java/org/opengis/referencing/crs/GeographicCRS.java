/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2011, Open Source Geospatial Foundation (OSGeo)
 *    (C) 2003-2005, Open Geospatial Consortium Inc.
 *
 *    All Rights Reserved. http://www.opengis.org/legal/
 */
package org.opengis.referencing.crs;

import static org.opengis.annotation.Obligation.*;
import static org.opengis.annotation.Specification.*;

import org.opengis.annotation.UML;
import org.opengis.referencing.cs.EllipsoidalCS;

/**
 * 定义经纬度坐标参考系统。
 * 基于大地水准面的椭圆近似的坐标参考系;
 * 这为地球表面的大部分提供了地理要素几何的精确表示。
 *
 * <p>地理CRS不适用于平面上的地图制作，因为它描述了曲面上的几何。
 * 在不引入失真的情况下，不可能在欧几里得平面中表示这种几何形状。
 * 控制这些扭曲的必要性促成了{@linkplain org.opengis.referencing.operation.Projection map projections}的科学发展。
 *
 * <TABLE CELLPADDING='6' BORDER='1'>
 * <TR BGCOLOR="#EEEEFF"><TH NOWRAP>Used with CS type(s)</TH></TR>
 * <TR><TD>
 *   {@link org.opengis.referencing.cs.EllipsoidalCS Ellipsoidal}
 * </TD></TR></TABLE>
 *
 * @version <A HREF="http://portal.opengeospatial.org/files/?artifact_id=6716">Abstract
 *     specification 2.0</A>
 * @author Martin Desruisseaux (IRD)
 * @since GeoAPI 1.0
 */
@UML(identifier = "SC_GeographicCRS", specification = ISO_19111)
public interface GeographicCRS extends GeodeticCRS {
    /** 返回坐标系，该坐标系必须是椭圆体。 */
    @UML(identifier = "usesCS", obligation = MANDATORY, specification = ISO_19111)
    EllipsoidalCS getCoordinateSystem();
}
