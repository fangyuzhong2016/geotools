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
 *1维，2维或3维坐标系。
 * 在2维和3维情况下给出相对于正交直轴的点的位置。
 * 在一维情况下，它包含一个直的坐标轴。
 *在多维情况下，所有轴应具有相同的长度测量单位。
 * {@code CartesianCS}应具有一个，两个或三个{@linkplain #getAxis 轴关联}。
 *
 * <TABLE CELLPADDING='6' BORDER='1'>
 * <TR BGCOLOR="#EEEEFF"><TH NOWRAP>Used with CRS type(s)</TH></TR>
 * <TR><TD>
 *   {@link org.opengis.referencing.crs.GeocentricCRS  Geocentric},
 *   {@link org.opengis.referencing.crs.ProjectedCRS   Projected},
 *   {@link org.opengis.referencing.crs.EngineeringCRS Engineering},
 *   {@link org.opengis.referencing.crs.ImageCRS       Image}
 * </TD></TR></TABLE>
 *
 * @version <A HREF="http://portal.opengeospatial.org/files/?artifact_id=6716">Abstract
 *     specification 2.0</A>
 * @author Martin Desruisseaux (IRD)
 * @since GeoAPI 1.0
 * @see AffineCS
 */
@UML(identifier = "CS_CartesianCS", specification = ISO_19111)
public interface CartesianCS extends AffineCS {}
