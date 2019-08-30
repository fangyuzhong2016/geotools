/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2011, Open Source Geospatial Foundation (OSGeo)
 *    (C) 2003-2005, Open Geospatial Consortium Inc.
 *
 *    All Rights Reserved. http://www.opengis.org/legal/
 */
package org.opengis.referencing.cs;

import static org.opengis.annotation.Obligation.*;
import static org.opengis.annotation.Specification.*;

import org.opengis.annotation.UML;
import org.opengis.referencing.IdentifiedObject;

/**
 * The set of coordinate system axes that spans a given coordinate space. A coordinate system (CS)
 * is derived from a set of (mathematical) rules for specifying how coordinates in a given space are
 * to be assigned to points. The coordinate values in a coordinate tuple shall be recorded in the
 * order in which the coordinate system axes associations are recorded, whenever those coordinates
 * use a coordinate reference system that uses this coordinate system.
 *
 * @version <A HREF="http://portal.opengeospatial.org/files/?artifact_id=6716">Abstract
 *     specification 2.0</A>
 * @author Martin Desruisseaux (IRD)
 * @since GeoAPI 1.0
 * @see org.opengis.referencing.cs.CoordinateSystemAxis
 * @see javax.measure.unit.Unit
 * @see org.opengis.referencing.datum.Datum
 * @see org.opengis.referencing.crs.CoordinateReferenceSystem
 */
@UML(identifier = "CS_CoordinateSystem", specification = ISO_19111)
public interface CoordinateSystem extends IdentifiedObject {
    /**
     * 返回坐标系的维度。
     *
     * @return 坐标系的维度。
     */
    int getDimension();

    /**
     * 返回指定尺寸的此坐标系的轴。每个坐标系统必须至少有一个轴。
     *
     * @param dimension 基于零的轴索引。
     * @return 指定尺寸的轴。
     * @throws IndexOutOfBoundsException if {@code dimension} is out of bounds.
     */
    @UML(identifier = "usesAxis", obligation = MANDATORY, specification = ISO_19111)
    CoordinateSystemAxis getAxis(int dimension) throws IndexOutOfBoundsException;
}
