/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 16.02.2017 16:31:45                         ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 *  
 */
package de.hybris.platform.productcockpitextended.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.productcockpitextended.constants.ProductcockpitextendedConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.productcockpitextended.jalo.MyProduct MyProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMyProduct extends Product
{
	/** Qualifier of the <code>MyProduct.someattribute</code> attribute **/
	public static final String SOMEATTRIBUTE = "someattribute";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SOMEATTRIBUTE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProduct.someattribute</code> attribute.
	 * @return the someattribute - example for product cockpit
	 */
	public String getSomeattribute(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedMyProduct.getSomeattribute requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, SOMEATTRIBUTE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProduct.someattribute</code> attribute.
	 * @return the someattribute - example for product cockpit
	 */
	public String getSomeattribute()
	{
		return getSomeattribute( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProduct.someattribute</code> attribute. 
	 * @return the localized someattribute - example for product cockpit
	 */
	public Map<Language,String> getAllSomeattribute(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,SOMEATTRIBUTE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyProduct.someattribute</code> attribute. 
	 * @return the localized someattribute - example for product cockpit
	 */
	public Map<Language,String> getAllSomeattribute()
	{
		return getAllSomeattribute( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProduct.someattribute</code> attribute. 
	 * @param value the someattribute - example for product cockpit
	 */
	public void setSomeattribute(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedMyProduct.setSomeattribute requires a session language", 0 );
		}
		setLocalizedProperty(ctx, SOMEATTRIBUTE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProduct.someattribute</code> attribute. 
	 * @param value the someattribute - example for product cockpit
	 */
	public void setSomeattribute(final String value)
	{
		setSomeattribute( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProduct.someattribute</code> attribute. 
	 * @param value the someattribute - example for product cockpit
	 */
	public void setAllSomeattribute(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,SOMEATTRIBUTE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyProduct.someattribute</code> attribute. 
	 * @param value the someattribute - example for product cockpit
	 */
	public void setAllSomeattribute(final Map<Language,String> value)
	{
		setAllSomeattribute( getSession().getSessionContext(), value );
	}
	
}
