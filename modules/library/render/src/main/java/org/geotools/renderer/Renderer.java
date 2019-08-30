/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2002-2008, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package org.geotools.renderer;

import java.awt.Graphics;
import org.geotools.feature.FeatureCollection;
import org.geotools.styling.Style;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Envelope;
import org.opengis.feature.Feature;
import org.opengis.feature.type.FeatureType;

/**
 * 渲染器的基本接口。这是一项非常重要的工作。 <strong>注意：此界面*将在未来版本中更改。</ strong>
 *
 * @version $Id$
 * @author James Macgill
 */
public interface Renderer {

    /**
     * 对提供的要素按照指定的样式进行渲染
     * 要素应该在视图区填充，但可能会超出视图区，因此如果显示到当前区域，应该将要素进行裁剪
     *
     * @param fc 要呈现的要素集合
     * @param viewport 要呈现的可见范围
     * @param style 要应用于每个要素的样式定义
     */
    void render(
            FeatureCollection<? extends FeatureType, ? extends Feature> fc,
            Envelope viewport,
            Style style);

    /**
     * Getter for property interactive.
     *
     * @return Value of property interactive.
     */
    boolean isInteractive();

    /**
     * Setter for property interactive.
     *
     * @param interactive New value of property interactive.
     */
    void setInteractive(boolean interactive);

    /** 设置渲染器的输出图形和图形的大小。 */
    void setOutput(Graphics g, java.awt.Rectangle r);

    public Coordinate pixelToWorld(int x, int y, Envelope map);
}
