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

import static org.opengis.annotation.Specification.*;

import org.opengis.annotation.UML;

/**
 * 具有直轴的二维或三维坐标系，其不一定是正交的。
 * {@code AffineCS}应具有两个或三个{@linkplain #getAxis 轴关联}。
 *
 * <TABLE CELLPADDING='6' BORDER='1'>
 * <TR BGCOLOR="#EEEEFF"><TH NOWRAP>Used with CRS type(s)</TH></TR>
 * <TR><TD>
 *   {@link org.opengis.referencing.crs.EngineeringCRS Engineering},
 *   {@link org.opengis.referencing.crs.ImageCRS       Image}
 * </TD></TR></TABLE>
 *
 * @version <A HREF="http://portal.opengeospatial.org/files/?artifact_id=6716">Abstract
 *     specification 2.0</A>
 * @author Martin Desruisseaux (IRD)
 * @since GeoAPI 2.0
 * @see CartesianCS
 */
@UML(identifier = "CS_AffineCS", specification = ISO_19111)
public interface AffineCS extends CoordinateSystem {}
