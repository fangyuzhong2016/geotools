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

// J2SE dependencies

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;

/**
 * 渲染器代表<code>MapPane</code>绘制地图。
 * 它确定了{@linkplain org.geotools.map.Context context}中要绘制的要素，边界框，大小和样式。
 *
 * @author Cameron Shorter
 * @version $Id$
 * @task REVISIT Renderer2D should extend Renderer once Renderer has been cleaned up.
 */
public interface Renderer2D {
    /**
     *基于{@link org.geotools.map.LayerList}，
     * 边界框和{@linkplain org.geotools.map.Context context}中指定的{@link  org.geotools.styling.Style}呈现要素。
     *
     * @param graphics 要绘制的图形处理程序。
     * @param paintArea 输出单元中输出区域的边界（通常是像素）
     *                  在大多数情况下，左上角是（0,0）。
     *                  但是，如果必须保留某个小部件区域，则允许使用不同的值，
     *                  例如左侧的边距和用于绘制*分度的顶部大小。
     * @param transform 将“世界坐标”转换为输出坐标的变换。
     *                  此变换将连接到<code>graphics</code>变换
     *                  （从<code>graphics.{@link Graphics2D＃transform（AffineTransform）transform}（变换）</code>）在渲染之前地点。
     */
    public void paint(Graphics2D graphics, Rectangle paintArea, AffineTransform transform);
}
