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
 * 定义一个坐标系统的接口。
 * 坐标系（CS）从一组（数学）规则导出，用于指定如何将给定空间中的坐标分配点。
 * 坐标元组中的坐标值应按照记录坐标系轴关联的顺序记录，只要这些坐标使用该坐标系的坐标参考系统。
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
