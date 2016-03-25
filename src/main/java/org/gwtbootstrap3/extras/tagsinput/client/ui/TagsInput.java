package org.gwtbootstrap3.extras.tagsinput.client.ui;

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

import org.gwtbootstrap3.extras.tagsinput.client.ui.base.SingleValueTagsInput;
import org.gwtbootstrap3.extras.typeahead.client.base.StringDataset;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Wrapper for Bootstrap Tags Input component.
 *
 * @author Marko Nikolić <marko.nikolic@iten.rs>
 */
public class TagsInput extends SingleValueTagsInput<String> {
    
    public TagsInput() {
    }

    public TagsInput(StringDataset dataset) {
        super(dataset);
    }

    @Override
    protected JavaScriptObject toJSO(String tag) {
        return toJSO_native(tag);
    }
    
    private native JavaScriptObject toJSO_native(String tag) /*-{
        return tag;
    }-*/;

    @Override
    protected String toJO(JavaScriptObject tag) {
        return tag.toString();
    }
}
