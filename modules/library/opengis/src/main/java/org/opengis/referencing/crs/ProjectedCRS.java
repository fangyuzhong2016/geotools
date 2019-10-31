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
import org.opengis.referencing.cs.CartesianCS;
import org.opengis.referencing.datum.GeodeticDatum;
import org.opengis.referencing.operation.Projection;

/**
 * 定义平面投影坐标参考系统
 * 用于近似平面上的地球形状的2D坐标参考系。
 * 它以这样的方式完成，即近似的固有的失真被仔细控制和已知。
 * 失真校正通常应用于计算的轴承和距离，以产生与实际场值紧密匹配的值。
 *
 * <TABLE CELLPADDING='6' BORDER='1'>
 * <TR BGCOLOR="#EEEEFF"><TH NOWRAP>Used with CS type(s)</TH></TR>
 * <TR><TD>
 *   {@link org.opengis.referencing.cs.CartesianCS Cartesian}
 * </TD></TR></TABLE>
 *
 * @version <A HREF="http://portal.opengeospatial.org/files/?artifact_id=6716">Abstract
 *     specification 2.0</A>
 * @author Martin Desruisseaux (IRD)
 * @since GeoAPI 1.0
 */
@UML(identifier = "SC_ProjectedCRS", specification = ISO_19111)
public interface ProjectedCRS extends GeneralDerivedCRS {
    /** 返回基本坐标参照系，该系统必须是地理坐标系。 */
    GeographicCRS getBaseCRS();

    /** 返回从{@linkplain #getBaseCRS base CRS} 到此CRS的映射投影。*/
    Projection getConversionFromBase();

    /** 返回坐标系，该坐标系必须是笛卡儿坐标系。 */
    @UML(identifier = "usesCS", obligation = MANDATORY, specification = ISO_19111)
    CartesianCS getCoordinateSystem();

    /**
     * 获取投影坐标参考的地理坐标的基准面
     * @return
     */
    GeodeticDatum getDatum();
}
