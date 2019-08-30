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

import static org.opengis.annotation.Specification.*;

import org.opengis.annotation.UML;

/**
 * 定义工程坐标参考系统的原点。
 * 工程数据用于该原点周围的区域。
 * 该原点可以相对于地球固定（例如施工现场的定义点），或者是移动车辆上的限定点（例如在船上或卫星上）。
 *
 * @version <A HREF="http://portal.opengeospatial.org/files/?artifact_id=6716">Abstract
 *     specification 2.0</A>
 * @author Martin Desruisseaux (IRD)
 * @since GeoAPI 1.0
 */
@UML(identifier = "CD_EngineeringDatum", specification = ISO_19111)
public interface EngineeringDatum extends Datum {}
