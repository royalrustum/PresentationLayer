/*
 * #%L
 * broadleaf-common-thymeleaf
 * %%
 * Copyright (C) 2009 - 2016 Broadleaf Commerce
 * %%
 * Licensed under the Broadleaf Fair Use License Agreement, Version 1.0
 * (the "Fair Use License" located  at http://license.broadleafcommerce.org/fair_use_license-1.0.txt)
 * unless the restrictions on use therein are violated and require payment to Broadleaf in which case
 * the Broadleaf End User License Agreement (EULA), Version 1.1
 * (the "Commercial License" located at http://license.broadleafcommerce.org/commercial_license-1.1.txt)
 * shall apply.
 * 
 * Alternatively, the Commercial License may be replaced with a mutually agreed upon license (the "Custom License")
 * between you and Broadleaf Commerce. You may not use this file except in compliance with the applicable license.
 * #L%
 */
package org.broadleafcommerce.presentation.thymeleaf2.model;

import org.broadleafcommerce.presentation.model.BroadleafTemplateElement;
import org.broadleafcommerce.presentation.model.BroadleafTemplateNonVoidElement;
import org.thymeleaf.dom.Element;
import org.thymeleaf.dom.Node;

/**
 * Class used to encapsulate the Thymeleaf 2 version of an element
 * 
 * Note that this is only for use inside of the Broadleaf common layer for Thymeleaf module
 * 
 * @author Jay Aisenbrey (cja769)
 *
 */
public class BroadleafThymeleaf2NonTextElement implements BroadleafTemplateNonVoidElement, BroadleafThymeleaf2TemplateEvent {

    protected Element element;

    public BroadleafThymeleaf2NonTextElement(Element element) {
        this.element = element;
    }

    @Override
    public void addChild(BroadleafTemplateElement child) {
        element.addChild(((BroadleafThymeleaf2TemplateEvent) child).getNode());
    }

    @Override
    public Node getNode() {
        return element;
    }

}
