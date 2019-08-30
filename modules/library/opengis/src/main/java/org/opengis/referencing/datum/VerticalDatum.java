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
 * 标识用作零高度表面的特定参考水平面的文本描述和/或一组参数。
 * 对于本标准认可的任何高度类型，描述包括其相对于地球的位置。
 * 有几种类型的垂直基准，每种类型都可以对{@linkplain org.opengis.referencing.cs.CoordinateSystemAxis Coordinate Axis}
 * 进行约束，并将其与组合以创建{@linkplain org.opengis.referencing.crs.VerticalCRS Vertical CRS}。
 *
 * @version <A HREF="http://portal.opengeospatial.org/files/?artifact_id=6716">Abstract
 *     specification 2.0</A>
 * @author Martin Desruisseaux (IRD)
 * @since GeoAPI 1.0
 */
@UML(identifier = "CD_VerticalDatum", specification = ISO_19111)
public interface VerticalDatum extends Datum {
    /**
     * 此垂直基准的类型。默认为“geoidal”。
     *
     * @return 此垂直基准的类型。
     */
    @UML(identifier = "vertDatumType", obligation = MANDATORY, specification = ISO_19111)
    VerticalDatumType getVerticalDatumType();
}
