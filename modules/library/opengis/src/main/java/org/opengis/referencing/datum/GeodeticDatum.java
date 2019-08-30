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

import org.opengis.annotation.UML;

/**
 * 定义近似于地球形状的参考椭球（或球体）的三维空间中的位置和精确方向。
 * 也用于以椭圆体（或球体）为中心的笛卡尔坐标系。
 *
 * @version <A HREF="http://portal.opengeospatial.org/files/?artifact_id=6716">Abstract
 *     specification 2.0</A>
 * @author Martin Desruisseaux (IRD)
 * @since GeoAPI 1.0
 * @see Ellipsoid
 * @see PrimeMeridian
 */
@UML(identifier = "CD_GeodeticDatum", specification = ISO_19111)
public interface GeodeticDatum extends Datum {
    /**
     * 返回椭球体。
     *
     * @return 椭球体。
     */
    @UML(identifier = "usesEllipsoid", obligation = MANDATORY, specification = ISO_19111)
    Ellipsoid getEllipsoid();

    /**
     * 返回本初子午线。
     *
     * @return 本初子午线。
     */
    @UML(identifier = "usesPrimeMeridian", obligation = MANDATORY, specification = ISO_19111)
    PrimeMeridian getPrimeMeridian();
}
