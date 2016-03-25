package org.gwtbootstrap3.extras.tagsinput.client.ui.base;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.gwtbootstrap3.extras.typeahead.client.base.CollectionDataset;
import org.gwtbootstrap3.extras.typeahead.client.base.Dataset;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.InputElement;
import com.google.gwt.user.client.ui.HasValue;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 - 2016 GwtBootstrap3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

/**
 * Wrapper for Bootstrap Tags Input component implemented with input box as underlying component.
 *
 * @author Marko Nikolić <marko.nikolic@iten.rs>
 */
public abstract class SingleValueTagsInput<T> extends TagsInputBase<T> implements HasValue<String> {

    public SingleValueTagsInput() {
        this(new CollectionDataset<T>(Collections.<T>emptyList()));
    }

    public SingleValueTagsInput(final Dataset<T> dataset) {
        this(Arrays.asList(dataset));
        
        setDatasets(dataset);
    }

    public SingleValueTagsInput(final Collection<? extends Dataset<T>> datasets) {
        InputElement tagsInput = Document.get().createTextInputElement();
        tagsInput.setAttribute("data-role", "tagsinput");
        
        setElement(tagsInput);        
        
        setDatasets(datasets);
    }

    /**
     * Returns comma delimited string with values from tags.
     * 
     * @return comma delimited string
     */
    @Override
    public String getValue() {
        // TODO return value from attributes mixin if not attached
        if (isAttached())
            return getValue(getElement());
        else
            return null;
    }

    @Override
    public void setValue(String value) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setValue(String value, boolean fireEvents) {
        // TODO Auto-generated method stub
        
    }
}
