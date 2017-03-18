/*
 * Copyright (c) 2014-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package org.lwjgl.util.yoga;

import org.testng.annotations.*;

import static org.lwjgl.util.yoga.YogaNode.*;
import static org.testng.Assert.*;

public class YGAlignContentTest {
	@Test
	public void test_align_content_flex_start() {
		YogaConfig config = new YogaConfig();

		YogaNode root = new YogaNode(config);
		root.setFlexDirection(YogaFlexDirection.ROW);
		root.setWrap(YogaWrap.WRAP);
		root.setWidth(130f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode(config);
		root_child0.setWidth(50f);
		root_child0.setHeight(10f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode(config);
		root_child1.setWidth(50f);
		root_child1.setHeight(10f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child2 = new YogaNode(config);
		root_child2.setWidth(50f);
		root_child2.setHeight(10f);
		root.addChildAt(root_child2, 2);

		YogaNode root_child3 = new YogaNode(config);
		root_child3.setWidth(50f);
		root_child3.setHeight(10f);
		root.addChildAt(root_child3, 3);

		YogaNode root_child4 = new YogaNode(config);
		root_child4.setWidth(50f);
		root_child4.setHeight(10f);
		root.addChildAt(root_child4, 4);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(130f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child2.getLayoutX(), 0.0f);
		assertEquals(10f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child3.getLayoutX(), 0.0f);
		assertEquals(10f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child4.getLayoutX(), 0.0f);
		assertEquals(20f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child4.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(130f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(80f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(30f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(80f, root_child2.getLayoutX(), 0.0f);
		assertEquals(10f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(30f, root_child3.getLayoutX(), 0.0f);
		assertEquals(10f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(80f, root_child4.getLayoutX(), 0.0f);
		assertEquals(20f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child4.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_content_flex_start_without_height_on_children() {
		YogaConfig config = new YogaConfig();

		YogaNode root = new YogaNode(config);
		root.setWrap(YogaWrap.WRAP);
		root.setWidth(100f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode(config);
		root_child0.setWidth(50f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode(config);
		root_child1.setWidth(50f);
		root_child1.setHeight(10f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child2 = new YogaNode(config);
		root_child2.setWidth(50f);
		root.addChildAt(root_child2, 2);

		YogaNode root_child3 = new YogaNode(config);
		root_child3.setWidth(50f);
		root_child3.setHeight(10f);
		root.addChildAt(root_child3, 3);

		YogaNode root_child4 = new YogaNode(config);
		root_child4.setWidth(50f);
		root.addChildAt(root_child4, 4);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(0f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child2.getLayoutX(), 0.0f);
		assertEquals(10f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(0f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child3.getLayoutX(), 0.0f);
		assertEquals(10f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child4.getLayoutX(), 0.0f);
		assertEquals(20f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(0f, root_child4.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(0f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child2.getLayoutX(), 0.0f);
		assertEquals(10f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(0f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child3.getLayoutX(), 0.0f);
		assertEquals(10f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child4.getLayoutX(), 0.0f);
		assertEquals(20f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(0f, root_child4.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_content_flex_start_with_flex() {
		YogaConfig config = new YogaConfig();

		YogaNode root = new YogaNode(config);
		root.setWrap(YogaWrap.WRAP);
		root.setWidth(100f);
		root.setHeight(120f);

		YogaNode root_child0 = new YogaNode(config);
		root_child0.setFlexGrow(1f);
		root_child0.setFlexBasisPercent(0f);
		root_child0.setWidth(50f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode(config);
		root_child1.setFlexGrow(1f);
		root_child1.setFlexBasisPercent(0f);
		root_child1.setWidth(50f);
		root_child1.setHeight(10f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child2 = new YogaNode(config);
		root_child2.setWidth(50f);
		root.addChildAt(root_child2, 2);

		YogaNode root_child3 = new YogaNode(config);
		root_child3.setFlexGrow(1f);
		root_child3.setFlexShrink(1f);
		root_child3.setFlexBasisPercent(0f);
		root_child3.setWidth(50f);
		root.addChildAt(root_child3, 3);

		YogaNode root_child4 = new YogaNode(config);
		root_child4.setWidth(50f);
		root.addChildAt(root_child4, 4);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(120f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(40f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1.getLayoutX(), 0.0f);
		assertEquals(40f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(40f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child2.getLayoutX(), 0.0f);
		assertEquals(80f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(0f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child3.getLayoutX(), 0.0f);
		assertEquals(80f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(40f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child4.getLayoutX(), 0.0f);
		assertEquals(120f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(0f, root_child4.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(120f, root.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(40f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(40f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(40f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child2.getLayoutX(), 0.0f);
		assertEquals(80f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(0f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child3.getLayoutX(), 0.0f);
		assertEquals(80f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(40f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child4.getLayoutX(), 0.0f);
		assertEquals(120f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(0f, root_child4.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_content_flex_end() {
		YogaConfig config = new YogaConfig();

		YogaNode root = new YogaNode(config);
		root.setAlignContent(YogaAlign.FLEX_END);
		root.setWrap(YogaWrap.WRAP);
		root.setWidth(100f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode(config);
		root_child0.setWidth(50f);
		root_child0.setHeight(10f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode(config);
		root_child1.setWidth(50f);
		root_child1.setHeight(10f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child2 = new YogaNode(config);
		root_child2.setWidth(50f);
		root_child2.setHeight(10f);
		root.addChildAt(root_child2, 2);

		YogaNode root_child3 = new YogaNode(config);
		root_child3.setWidth(50f);
		root_child3.setHeight(10f);
		root.addChildAt(root_child3, 3);

		YogaNode root_child4 = new YogaNode(config);
		root_child4.setWidth(50f);
		root_child4.setHeight(10f);
		root.addChildAt(root_child4, 4);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1.getLayoutX(), 0.0f);
		assertEquals(10f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child2.getLayoutX(), 0.0f);
		assertEquals(20f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child3.getLayoutX(), 0.0f);
		assertEquals(30f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child4.getLayoutX(), 0.0f);
		assertEquals(40f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child4.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(10f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child2.getLayoutX(), 0.0f);
		assertEquals(20f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child3.getLayoutX(), 0.0f);
		assertEquals(30f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child4.getLayoutX(), 0.0f);
		assertEquals(40f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child4.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_content_stretch() {
		YogaConfig config = new YogaConfig();

		YogaNode root = new YogaNode(config);
		root.setAlignContent(YogaAlign.STRETCH);
		root.setWrap(YogaWrap.WRAP);
		root.setWidth(150f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode(config);
		root_child0.setWidth(50f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode(config);
		root_child1.setWidth(50f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child2 = new YogaNode(config);
		root_child2.setWidth(50f);
		root.addChildAt(root_child2, 2);

		YogaNode root_child3 = new YogaNode(config);
		root_child3.setWidth(50f);
		root.addChildAt(root_child3, 3);

		YogaNode root_child4 = new YogaNode(config);
		root_child4.setWidth(50f);
		root.addChildAt(root_child4, 4);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(150f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(0f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(0f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child2.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(0f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child3.getLayoutX(), 0.0f);
		assertEquals(0f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(0f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child4.getLayoutX(), 0.0f);
		assertEquals(0f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(0f, root_child4.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(150f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(0f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(0f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child2.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(0f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child3.getLayoutX(), 0.0f);
		assertEquals(0f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(0f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child4.getLayoutX(), 0.0f);
		assertEquals(0f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(0f, root_child4.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_content_spacebetween() {
		YogaConfig config = new YogaConfig();

		YogaNode root = new YogaNode(config);
		root.setFlexDirection(YogaFlexDirection.ROW);
		root.setAlignContent(YogaAlign.SPACE_BETWEEN);
		root.setWrap(YogaWrap.WRAP);
		root.setWidth(130f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode(config);
		root_child0.setWidth(50f);
		root_child0.setHeight(10f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode(config);
		root_child1.setWidth(50f);
		root_child1.setHeight(10f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child2 = new YogaNode(config);
		root_child2.setWidth(50f);
		root_child2.setHeight(10f);
		root.addChildAt(root_child2, 2);

		YogaNode root_child3 = new YogaNode(config);
		root_child3.setWidth(50f);
		root_child3.setHeight(10f);
		root.addChildAt(root_child3, 3);

		YogaNode root_child4 = new YogaNode(config);
		root_child4.setWidth(50f);
		root_child4.setHeight(10f);
		root.addChildAt(root_child4, 4);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(130f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child2.getLayoutX(), 0.0f);
		assertEquals(45f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child3.getLayoutX(), 0.0f);
		assertEquals(45f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child4.getLayoutX(), 0.0f);
		assertEquals(90f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child4.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(130f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(80f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(30f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(80f, root_child2.getLayoutX(), 0.0f);
		assertEquals(45f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(30f, root_child3.getLayoutX(), 0.0f);
		assertEquals(45f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(80f, root_child4.getLayoutX(), 0.0f);
		assertEquals(90f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child4.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_content_spacearound() {
		YogaConfig config = new YogaConfig();

		YogaNode root = new YogaNode(config);
		root.setFlexDirection(YogaFlexDirection.ROW);
		root.setAlignContent(YogaAlign.SPACE_AROUND);
		root.setWrap(YogaWrap.WRAP);
		root.setWidth(140f);
		root.setHeight(120f);

		YogaNode root_child0 = new YogaNode(config);
		root_child0.setWidth(50f);
		root_child0.setHeight(10f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode(config);
		root_child1.setWidth(50f);
		root_child1.setHeight(10f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child2 = new YogaNode(config);
		root_child2.setWidth(50f);
		root_child2.setHeight(10f);
		root.addChildAt(root_child2, 2);

		YogaNode root_child3 = new YogaNode(config);
		root_child3.setWidth(50f);
		root_child3.setHeight(10f);
		root.addChildAt(root_child3, 3);

		YogaNode root_child4 = new YogaNode(config);
		root_child4.setWidth(50f);
		root_child4.setHeight(10f);
		root.addChildAt(root_child4, 4);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(140f, root.getLayoutWidth(), 0.0f);
		assertEquals(120f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(15f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(15f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child2.getLayoutX(), 0.0f);
		assertEquals(55f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child3.getLayoutX(), 0.0f);
		assertEquals(55f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child4.getLayoutX(), 0.0f);
		assertEquals(95f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child4.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(140f, root.getLayoutWidth(), 0.0f);
		assertEquals(120f, root.getLayoutHeight(), 0.0f);

		assertEquals(90f, root_child0.getLayoutX(), 0.0f);
		assertEquals(15f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(40f, root_child1.getLayoutX(), 0.0f);
		assertEquals(15f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(90f, root_child2.getLayoutX(), 0.0f);
		assertEquals(55f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(40f, root_child3.getLayoutX(), 0.0f);
		assertEquals(55f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(90f, root_child4.getLayoutX(), 0.0f);
		assertEquals(95f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child4.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_content_stretch_row() {
		YogaConfig config = new YogaConfig();

		YogaNode root = new YogaNode(config);
		root.setFlexDirection(YogaFlexDirection.ROW);
		root.setAlignContent(YogaAlign.STRETCH);
		root.setWrap(YogaWrap.WRAP);
		root.setWidth(150f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode(config);
		root_child0.setWidth(50f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode(config);
		root_child1.setWidth(50f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child2 = new YogaNode(config);
		root_child2.setWidth(50f);
		root.addChildAt(root_child2, 2);

		YogaNode root_child3 = new YogaNode(config);
		root_child3.setWidth(50f);
		root.addChildAt(root_child3, 3);

		YogaNode root_child4 = new YogaNode(config);
		root_child4.setWidth(50f);
		root.addChildAt(root_child4, 4);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(150f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child2.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child3.getLayoutX(), 0.0f);
		assertEquals(50f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child4.getLayoutX(), 0.0f);
		assertEquals(50f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child4.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(150f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child2.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child3.getLayoutX(), 0.0f);
		assertEquals(50f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child4.getLayoutX(), 0.0f);
		assertEquals(50f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child4.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_content_stretch_row_with_children() {
		YogaConfig config = new YogaConfig();

		YogaNode root = new YogaNode(config);
		root.setFlexDirection(YogaFlexDirection.ROW);
		root.setAlignContent(YogaAlign.STRETCH);
		root.setWrap(YogaWrap.WRAP);
		root.setWidth(150f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode(config);
		root_child0.setWidth(50f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child0_child0 = new YogaNode(config);
		root_child0_child0.setFlexGrow(1f);
		root_child0_child0.setFlexShrink(1f);
		root_child0_child0.setFlexBasisPercent(0f);
		root_child0.addChildAt(root_child0_child0, 0);

		YogaNode root_child1 = new YogaNode(config);
		root_child1.setWidth(50f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child2 = new YogaNode(config);
		root_child2.setWidth(50f);
		root.addChildAt(root_child2, 2);

		YogaNode root_child3 = new YogaNode(config);
		root_child3.setWidth(50f);
		root.addChildAt(root_child3, 3);

		YogaNode root_child4 = new YogaNode(config);
		root_child4.setWidth(50f);
		root.addChildAt(root_child4, 4);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(150f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child2.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child3.getLayoutX(), 0.0f);
		assertEquals(50f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child4.getLayoutX(), 0.0f);
		assertEquals(50f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child4.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(150f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child2.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child3.getLayoutX(), 0.0f);
		assertEquals(50f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child4.getLayoutX(), 0.0f);
		assertEquals(50f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child4.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_content_stretch_row_with_flex() {
		YogaConfig config = new YogaConfig();

		YogaNode root = new YogaNode(config);
		root.setFlexDirection(YogaFlexDirection.ROW);
		root.setAlignContent(YogaAlign.STRETCH);
		root.setWrap(YogaWrap.WRAP);
		root.setWidth(150f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode(config);
		root_child0.setWidth(50f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode(config);
		root_child1.setFlexGrow(1f);
		root_child1.setFlexShrink(1f);
		root_child1.setFlexBasisPercent(0f);
		root_child1.setWidth(50f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child2 = new YogaNode(config);
		root_child2.setWidth(50f);
		root.addChildAt(root_child2, 2);

		YogaNode root_child3 = new YogaNode(config);
		root_child3.setFlexGrow(1f);
		root_child3.setFlexShrink(1f);
		root_child3.setFlexBasisPercent(0f);
		root_child3.setWidth(50f);
		root.addChildAt(root_child3, 3);

		YogaNode root_child4 = new YogaNode(config);
		root_child4.setWidth(50f);
		root.addChildAt(root_child4, 4);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(150f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(0f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child2.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child3.getLayoutX(), 0.0f);
		assertEquals(0f, root_child3.getLayoutY(), 0.0f);
		assertEquals(0f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child4.getLayoutX(), 0.0f);
		assertEquals(0f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child4.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(150f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(0f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child2.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child3.getLayoutX(), 0.0f);
		assertEquals(0f, root_child3.getLayoutY(), 0.0f);
		assertEquals(0f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child4.getLayoutX(), 0.0f);
		assertEquals(0f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child4.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_content_stretch_row_with_flex_no_shrink() {
		YogaConfig config = new YogaConfig();

		YogaNode root = new YogaNode(config);
		root.setFlexDirection(YogaFlexDirection.ROW);
		root.setAlignContent(YogaAlign.STRETCH);
		root.setWrap(YogaWrap.WRAP);
		root.setWidth(150f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode(config);
		root_child0.setWidth(50f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode(config);
		root_child1.setFlexGrow(1f);
		root_child1.setFlexShrink(1f);
		root_child1.setFlexBasisPercent(0f);
		root_child1.setWidth(50f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child2 = new YogaNode(config);
		root_child2.setWidth(50f);
		root.addChildAt(root_child2, 2);

		YogaNode root_child3 = new YogaNode(config);
		root_child3.setFlexGrow(1f);
		root_child3.setFlexBasisPercent(0f);
		root_child3.setWidth(50f);
		root.addChildAt(root_child3, 3);

		YogaNode root_child4 = new YogaNode(config);
		root_child4.setWidth(50f);
		root.addChildAt(root_child4, 4);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(150f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(0f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child2.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child3.getLayoutX(), 0.0f);
		assertEquals(0f, root_child3.getLayoutY(), 0.0f);
		assertEquals(0f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child4.getLayoutX(), 0.0f);
		assertEquals(0f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child4.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(150f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(0f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child2.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child3.getLayoutX(), 0.0f);
		assertEquals(0f, root_child3.getLayoutY(), 0.0f);
		assertEquals(0f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child4.getLayoutX(), 0.0f);
		assertEquals(0f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child4.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_content_stretch_row_with_margin() {
		YogaConfig config = new YogaConfig();

		YogaNode root = new YogaNode(config);
		root.setFlexDirection(YogaFlexDirection.ROW);
		root.setAlignContent(YogaAlign.STRETCH);
		root.setWrap(YogaWrap.WRAP);
		root.setWidth(150f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode(config);
		root_child0.setWidth(50f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode(config);
		root_child1.setMargin(YogaEdge.LEFT, 10f);
		root_child1.setMargin(YogaEdge.TOP, 10f);
		root_child1.setMargin(YogaEdge.RIGHT, 10f);
		root_child1.setMargin(YogaEdge.BOTTOM, 10f);
		root_child1.setWidth(50f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child2 = new YogaNode(config);
		root_child2.setWidth(50f);
		root.addChildAt(root_child2, 2);

		YogaNode root_child3 = new YogaNode(config);
		root_child3.setMargin(YogaEdge.LEFT, 10f);
		root_child3.setMargin(YogaEdge.TOP, 10f);
		root_child3.setMargin(YogaEdge.RIGHT, 10f);
		root_child3.setMargin(YogaEdge.BOTTOM, 10f);
		root_child3.setWidth(50f);
		root.addChildAt(root_child3, 3);

		YogaNode root_child4 = new YogaNode(config);
		root_child4.setWidth(50f);
		root.addChildAt(root_child4, 4);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(150f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(40f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(60f, root_child1.getLayoutX(), 0.0f);
		assertEquals(10f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child2.getLayoutX(), 0.0f);
		assertEquals(40f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(40f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(60f, root_child3.getLayoutX(), 0.0f);
		assertEquals(50f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child4.getLayoutX(), 0.0f);
		assertEquals(80f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child4.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(150f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(40f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(40f, root_child1.getLayoutX(), 0.0f);
		assertEquals(10f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child2.getLayoutX(), 0.0f);
		assertEquals(40f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(40f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(40f, root_child3.getLayoutX(), 0.0f);
		assertEquals(50f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child4.getLayoutX(), 0.0f);
		assertEquals(80f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child4.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_content_stretch_row_with_padding() {
		YogaConfig config = new YogaConfig();

		YogaNode root = new YogaNode(config);
		root.setFlexDirection(YogaFlexDirection.ROW);
		root.setAlignContent(YogaAlign.STRETCH);
		root.setWrap(YogaWrap.WRAP);
		root.setWidth(150f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode(config);
		root_child0.setWidth(50f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode(config);
		root_child1.setPadding(YogaEdge.LEFT, 10);
		root_child1.setPadding(YogaEdge.TOP, 10);
		root_child1.setPadding(YogaEdge.RIGHT, 10);
		root_child1.setPadding(YogaEdge.BOTTOM, 10);
		root_child1.setWidth(50f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child2 = new YogaNode(config);
		root_child2.setWidth(50f);
		root.addChildAt(root_child2, 2);

		YogaNode root_child3 = new YogaNode(config);
		root_child3.setPadding(YogaEdge.LEFT, 10);
		root_child3.setPadding(YogaEdge.TOP, 10);
		root_child3.setPadding(YogaEdge.RIGHT, 10);
		root_child3.setPadding(YogaEdge.BOTTOM, 10);
		root_child3.setWidth(50f);
		root.addChildAt(root_child3, 3);

		YogaNode root_child4 = new YogaNode(config);
		root_child4.setWidth(50f);
		root.addChildAt(root_child4, 4);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(150f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child2.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child3.getLayoutX(), 0.0f);
		assertEquals(50f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child4.getLayoutX(), 0.0f);
		assertEquals(50f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child4.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(150f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child2.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child3.getLayoutX(), 0.0f);
		assertEquals(50f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child4.getLayoutX(), 0.0f);
		assertEquals(50f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child4.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_content_stretch_row_with_single_row() {
		YogaConfig config = new YogaConfig();

		YogaNode root = new YogaNode(config);
		root.setFlexDirection(YogaFlexDirection.ROW);
		root.setAlignContent(YogaAlign.STRETCH);
		root.setWrap(YogaWrap.WRAP);
		root.setWidth(150f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode(config);
		root_child0.setWidth(50f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode(config);
		root_child1.setWidth(50f);
		root.addChildAt(root_child1, 1);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(150f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child1.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(150f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child1.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_content_stretch_row_with_fixed_height() {
		YogaConfig config = new YogaConfig();

		YogaNode root = new YogaNode(config);
		root.setFlexDirection(YogaFlexDirection.ROW);
		root.setAlignContent(YogaAlign.STRETCH);
		root.setWrap(YogaWrap.WRAP);
		root.setWidth(150f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode(config);
		root_child0.setWidth(50f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode(config);
		root_child1.setWidth(50f);
		root_child1.setHeight(60f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child2 = new YogaNode(config);
		root_child2.setWidth(50f);
		root.addChildAt(root_child2, 2);

		YogaNode root_child3 = new YogaNode(config);
		root_child3.setWidth(50f);
		root.addChildAt(root_child3, 3);

		YogaNode root_child4 = new YogaNode(config);
		root_child4.setWidth(50f);
		root.addChildAt(root_child4, 4);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(150f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(80f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(60f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child2.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(80f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child3.getLayoutX(), 0.0f);
		assertEquals(80f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child4.getLayoutX(), 0.0f);
		assertEquals(80f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child4.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(150f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(80f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(60f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child2.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(80f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child3.getLayoutX(), 0.0f);
		assertEquals(80f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child4.getLayoutX(), 0.0f);
		assertEquals(80f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child4.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_content_stretch_row_with_max_height() {
		YogaConfig config = new YogaConfig();

		YogaNode root = new YogaNode(config);
		root.setFlexDirection(YogaFlexDirection.ROW);
		root.setAlignContent(YogaAlign.STRETCH);
		root.setWrap(YogaWrap.WRAP);
		root.setWidth(150f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode(config);
		root_child0.setWidth(50f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode(config);
		root_child1.setWidth(50f);
		root_child1.setMaxHeight(20f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child2 = new YogaNode(config);
		root_child2.setWidth(50f);
		root.addChildAt(root_child2, 2);

		YogaNode root_child3 = new YogaNode(config);
		root_child3.setWidth(50f);
		root.addChildAt(root_child3, 3);

		YogaNode root_child4 = new YogaNode(config);
		root_child4.setWidth(50f);
		root.addChildAt(root_child4, 4);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(150f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child2.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child3.getLayoutX(), 0.0f);
		assertEquals(50f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child4.getLayoutX(), 0.0f);
		assertEquals(50f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child4.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(150f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child2.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child3.getLayoutX(), 0.0f);
		assertEquals(50f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child4.getLayoutX(), 0.0f);
		assertEquals(50f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child4.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_content_stretch_row_with_min_height() {
		YogaConfig config = new YogaConfig();

		YogaNode root = new YogaNode(config);
		root.setFlexDirection(YogaFlexDirection.ROW);
		root.setAlignContent(YogaAlign.STRETCH);
		root.setWrap(YogaWrap.WRAP);
		root.setWidth(150f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode(config);
		root_child0.setWidth(50f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode(config);
		root_child1.setWidth(50f);
		root_child1.setMinHeight(80f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child2 = new YogaNode(config);
		root_child2.setWidth(50f);
		root.addChildAt(root_child2, 2);

		YogaNode root_child3 = new YogaNode(config);
		root_child3.setWidth(50f);
		root.addChildAt(root_child3, 3);

		YogaNode root_child4 = new YogaNode(config);
		root_child4.setWidth(50f);
		root.addChildAt(root_child4, 4);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(150f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(90f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(90f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child2.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(90f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child3.getLayoutX(), 0.0f);
		assertEquals(90f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child4.getLayoutX(), 0.0f);
		assertEquals(90f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child4.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(150f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(90f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(90f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child2.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(90f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(100f, root_child3.getLayoutX(), 0.0f);
		assertEquals(90f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child4.getLayoutX(), 0.0f);
		assertEquals(90f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child4.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_content_stretch_column() {
		YogaConfig config = new YogaConfig();

		YogaNode root = new YogaNode(config);
		root.setAlignContent(YogaAlign.STRETCH);
		root.setWrap(YogaWrap.WRAP);
		root.setWidth(100f);
		root.setHeight(150f);

		YogaNode root_child0 = new YogaNode(config);
		root_child0.setHeight(50f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child0_child0 = new YogaNode(config);
		root_child0_child0.setFlexGrow(1f);
		root_child0_child0.setFlexShrink(1f);
		root_child0_child0.setFlexBasisPercent(0f);
		root_child0.addChildAt(root_child0_child0, 0);

		YogaNode root_child1 = new YogaNode(config);
		root_child1.setFlexGrow(1f);
		root_child1.setFlexShrink(1f);
		root_child1.setFlexBasisPercent(0f);
		root_child1.setHeight(50f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child2 = new YogaNode(config);
		root_child2.setHeight(50f);
		root.addChildAt(root_child2, 2);

		YogaNode root_child3 = new YogaNode(config);
		root_child3.setHeight(50f);
		root.addChildAt(root_child3, 3);

		YogaNode root_child4 = new YogaNode(config);
		root_child4.setHeight(50f);
		root.addChildAt(root_child4, 4);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(150f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1.getLayoutX(), 0.0f);
		assertEquals(50f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(0f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child2.getLayoutX(), 0.0f);
		assertEquals(50f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child3.getLayoutX(), 0.0f);
		assertEquals(100f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child4.getLayoutX(), 0.0f);
		assertEquals(0f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child4.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(150f, root.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(50f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(0f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child2.getLayoutX(), 0.0f);
		assertEquals(50f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child3.getLayoutX(), 0.0f);
		assertEquals(100f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child3.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child4.getLayoutX(), 0.0f);
		assertEquals(0f, root_child4.getLayoutY(), 0.0f);
		assertEquals(50f, root_child4.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child4.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_content_stretch_is_not_overriding_align_items() {
		YogaConfig config = new YogaConfig();

		YogaNode root = new YogaNode(config);
		root.setAlignContent(YogaAlign.STRETCH);

		YogaNode root_child0 = new YogaNode(config);
		root_child0.setFlexDirection(YogaFlexDirection.ROW);
		root_child0.setAlignContent(YogaAlign.STRETCH);
		root_child0.setAlignItems(YogaAlign.CENTER);
		root_child0.setWidth(100f);
		root_child0.setHeight(100f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child0_child0 = new YogaNode(config);
		root_child0_child0.setAlignContent(YogaAlign.STRETCH);
		root_child0_child0.setWidth(10f);
		root_child0_child0.setHeight(10f);
		root_child0.addChildAt(root_child0_child0, 0);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
		assertEquals(45f, root_child0_child0.getLayoutY(), 0.0f);
		assertEquals(10f, root_child0_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child0_child0.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(90f, root_child0_child0.getLayoutX(), 0.0f);
		assertEquals(45f, root_child0_child0.getLayoutY(), 0.0f);
		assertEquals(10f, root_child0_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child0_child0.getLayoutHeight(), 0.0f);
	}

}
