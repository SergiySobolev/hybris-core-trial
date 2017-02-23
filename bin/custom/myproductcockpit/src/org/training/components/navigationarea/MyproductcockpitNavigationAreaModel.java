/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 * 
 *  
 */
package org.training.components.navigationarea;

import de.hybris.platform.cockpit.components.navigationarea.DefaultNavigationAreaModel;
import de.hybris.platform.cockpit.session.impl.AbstractUINavigationArea;

import org.training.session.impl.MyproductcockpitNavigationArea;


/**
 * Myproductcockpit navigation area model.
 */
public class MyproductcockpitNavigationAreaModel extends DefaultNavigationAreaModel
{
	public MyproductcockpitNavigationAreaModel()
	{
		super();
	}

	public MyproductcockpitNavigationAreaModel(final AbstractUINavigationArea area)
	{
		super(area);
	}

	@Override
	public MyproductcockpitNavigationArea getNavigationArea()
	{
		return (MyproductcockpitNavigationArea) super.getNavigationArea();
	}
}
