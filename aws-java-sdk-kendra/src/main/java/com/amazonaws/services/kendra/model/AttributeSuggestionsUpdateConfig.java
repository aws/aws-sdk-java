/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Updates the configuration information for the document fields/attributes that you want to base query suggestions on.
 * </p>
 * <p>
 * To deactivate using documents fields for query suggestions, set the mode to <code>INACTIVE</code>. You must also set
 * <code>SuggestionTypes</code> as either <code>QUERY</code> or <code>DOCUMENT_ATTRIBUTES</code> and then call <a
 * href="https://docs.aws.amazon.com/kendra/latest/dg/API_GetQuerySuggestions.html">GetQuerySuggestions</a>. If you set
 * to <code>QUERY</code>, then Amazon Kendra uses the query history to base suggestions on. If you set to
 * <code>DOCUMENT_ATTRIBUTES</code>, then Amazon Kendra uses the contents of document fields to base suggestions on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/AttributeSuggestionsUpdateConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttributeSuggestionsUpdateConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of fields/attributes that you want to set as suggestible for query suggestions.
     * </p>
     */
    private java.util.List<SuggestableConfig> suggestableConfigList;
    /**
     * <p>
     * You can set the mode to <code>ACTIVE</code> or <code>INACTIVE</code>. You must also set
     * <code>SuggestionTypes</code> as either <code>QUERY</code> or <code>DOCUMENT_ATTRIBUTES</code> and then call <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_GetQuerySuggestions.html">GetQuerySuggestions</a>. If
     * <code>Mode</code> to use query history is set to <code>ENABLED</code> when calling <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateQuerySuggestionsConfig.html"
     * >UpdateQuerySuggestionsConfig</a> and <code>AttributeSuggestionsMode</code> to use fields/attributes is set to
     * <code>ACTIVE</code>, and you haven't set your <code>SuggestionTypes</code> preference to
     * <code>DOCUMENT_ATTRIBUTES</code>, then Amazon Kendra uses the query history.
     * </p>
     */
    private String attributeSuggestionsMode;

    /**
     * <p>
     * The list of fields/attributes that you want to set as suggestible for query suggestions.
     * </p>
     * 
     * @return The list of fields/attributes that you want to set as suggestible for query suggestions.
     */

    public java.util.List<SuggestableConfig> getSuggestableConfigList() {
        return suggestableConfigList;
    }

    /**
     * <p>
     * The list of fields/attributes that you want to set as suggestible for query suggestions.
     * </p>
     * 
     * @param suggestableConfigList
     *        The list of fields/attributes that you want to set as suggestible for query suggestions.
     */

    public void setSuggestableConfigList(java.util.Collection<SuggestableConfig> suggestableConfigList) {
        if (suggestableConfigList == null) {
            this.suggestableConfigList = null;
            return;
        }

        this.suggestableConfigList = new java.util.ArrayList<SuggestableConfig>(suggestableConfigList);
    }

    /**
     * <p>
     * The list of fields/attributes that you want to set as suggestible for query suggestions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuggestableConfigList(java.util.Collection)} or
     * {@link #withSuggestableConfigList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param suggestableConfigList
     *        The list of fields/attributes that you want to set as suggestible for query suggestions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeSuggestionsUpdateConfig withSuggestableConfigList(SuggestableConfig... suggestableConfigList) {
        if (this.suggestableConfigList == null) {
            setSuggestableConfigList(new java.util.ArrayList<SuggestableConfig>(suggestableConfigList.length));
        }
        for (SuggestableConfig ele : suggestableConfigList) {
            this.suggestableConfigList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of fields/attributes that you want to set as suggestible for query suggestions.
     * </p>
     * 
     * @param suggestableConfigList
     *        The list of fields/attributes that you want to set as suggestible for query suggestions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeSuggestionsUpdateConfig withSuggestableConfigList(java.util.Collection<SuggestableConfig> suggestableConfigList) {
        setSuggestableConfigList(suggestableConfigList);
        return this;
    }

    /**
     * <p>
     * You can set the mode to <code>ACTIVE</code> or <code>INACTIVE</code>. You must also set
     * <code>SuggestionTypes</code> as either <code>QUERY</code> or <code>DOCUMENT_ATTRIBUTES</code> and then call <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_GetQuerySuggestions.html">GetQuerySuggestions</a>. If
     * <code>Mode</code> to use query history is set to <code>ENABLED</code> when calling <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateQuerySuggestionsConfig.html"
     * >UpdateQuerySuggestionsConfig</a> and <code>AttributeSuggestionsMode</code> to use fields/attributes is set to
     * <code>ACTIVE</code>, and you haven't set your <code>SuggestionTypes</code> preference to
     * <code>DOCUMENT_ATTRIBUTES</code>, then Amazon Kendra uses the query history.
     * </p>
     * 
     * @param attributeSuggestionsMode
     *        You can set the mode to <code>ACTIVE</code> or <code>INACTIVE</code>. You must also set
     *        <code>SuggestionTypes</code> as either <code>QUERY</code> or <code>DOCUMENT_ATTRIBUTES</code> and then
     *        call <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_GetQuerySuggestions.html">GetQuerySuggestions</a>.
     *        If <code>Mode</code> to use query history is set to <code>ENABLED</code> when calling <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateQuerySuggestionsConfig.html"
     *        >UpdateQuerySuggestionsConfig</a> and <code>AttributeSuggestionsMode</code> to use fields/attributes is
     *        set to <code>ACTIVE</code>, and you haven't set your <code>SuggestionTypes</code> preference to
     *        <code>DOCUMENT_ATTRIBUTES</code>, then Amazon Kendra uses the query history.
     * @see AttributeSuggestionsMode
     */

    public void setAttributeSuggestionsMode(String attributeSuggestionsMode) {
        this.attributeSuggestionsMode = attributeSuggestionsMode;
    }

    /**
     * <p>
     * You can set the mode to <code>ACTIVE</code> or <code>INACTIVE</code>. You must also set
     * <code>SuggestionTypes</code> as either <code>QUERY</code> or <code>DOCUMENT_ATTRIBUTES</code> and then call <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_GetQuerySuggestions.html">GetQuerySuggestions</a>. If
     * <code>Mode</code> to use query history is set to <code>ENABLED</code> when calling <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateQuerySuggestionsConfig.html"
     * >UpdateQuerySuggestionsConfig</a> and <code>AttributeSuggestionsMode</code> to use fields/attributes is set to
     * <code>ACTIVE</code>, and you haven't set your <code>SuggestionTypes</code> preference to
     * <code>DOCUMENT_ATTRIBUTES</code>, then Amazon Kendra uses the query history.
     * </p>
     * 
     * @return You can set the mode to <code>ACTIVE</code> or <code>INACTIVE</code>. You must also set
     *         <code>SuggestionTypes</code> as either <code>QUERY</code> or <code>DOCUMENT_ATTRIBUTES</code> and then
     *         call <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/API_GetQuerySuggestions.html">GetQuerySuggestions</a>.
     *         If <code>Mode</code> to use query history is set to <code>ENABLED</code> when calling <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateQuerySuggestionsConfig.html"
     *         >UpdateQuerySuggestionsConfig</a> and <code>AttributeSuggestionsMode</code> to use fields/attributes is
     *         set to <code>ACTIVE</code>, and you haven't set your <code>SuggestionTypes</code> preference to
     *         <code>DOCUMENT_ATTRIBUTES</code>, then Amazon Kendra uses the query history.
     * @see AttributeSuggestionsMode
     */

    public String getAttributeSuggestionsMode() {
        return this.attributeSuggestionsMode;
    }

    /**
     * <p>
     * You can set the mode to <code>ACTIVE</code> or <code>INACTIVE</code>. You must also set
     * <code>SuggestionTypes</code> as either <code>QUERY</code> or <code>DOCUMENT_ATTRIBUTES</code> and then call <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_GetQuerySuggestions.html">GetQuerySuggestions</a>. If
     * <code>Mode</code> to use query history is set to <code>ENABLED</code> when calling <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateQuerySuggestionsConfig.html"
     * >UpdateQuerySuggestionsConfig</a> and <code>AttributeSuggestionsMode</code> to use fields/attributes is set to
     * <code>ACTIVE</code>, and you haven't set your <code>SuggestionTypes</code> preference to
     * <code>DOCUMENT_ATTRIBUTES</code>, then Amazon Kendra uses the query history.
     * </p>
     * 
     * @param attributeSuggestionsMode
     *        You can set the mode to <code>ACTIVE</code> or <code>INACTIVE</code>. You must also set
     *        <code>SuggestionTypes</code> as either <code>QUERY</code> or <code>DOCUMENT_ATTRIBUTES</code> and then
     *        call <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_GetQuerySuggestions.html">GetQuerySuggestions</a>.
     *        If <code>Mode</code> to use query history is set to <code>ENABLED</code> when calling <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateQuerySuggestionsConfig.html"
     *        >UpdateQuerySuggestionsConfig</a> and <code>AttributeSuggestionsMode</code> to use fields/attributes is
     *        set to <code>ACTIVE</code>, and you haven't set your <code>SuggestionTypes</code> preference to
     *        <code>DOCUMENT_ATTRIBUTES</code>, then Amazon Kendra uses the query history.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttributeSuggestionsMode
     */

    public AttributeSuggestionsUpdateConfig withAttributeSuggestionsMode(String attributeSuggestionsMode) {
        setAttributeSuggestionsMode(attributeSuggestionsMode);
        return this;
    }

    /**
     * <p>
     * You can set the mode to <code>ACTIVE</code> or <code>INACTIVE</code>. You must also set
     * <code>SuggestionTypes</code> as either <code>QUERY</code> or <code>DOCUMENT_ATTRIBUTES</code> and then call <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_GetQuerySuggestions.html">GetQuerySuggestions</a>. If
     * <code>Mode</code> to use query history is set to <code>ENABLED</code> when calling <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateQuerySuggestionsConfig.html"
     * >UpdateQuerySuggestionsConfig</a> and <code>AttributeSuggestionsMode</code> to use fields/attributes is set to
     * <code>ACTIVE</code>, and you haven't set your <code>SuggestionTypes</code> preference to
     * <code>DOCUMENT_ATTRIBUTES</code>, then Amazon Kendra uses the query history.
     * </p>
     * 
     * @param attributeSuggestionsMode
     *        You can set the mode to <code>ACTIVE</code> or <code>INACTIVE</code>. You must also set
     *        <code>SuggestionTypes</code> as either <code>QUERY</code> or <code>DOCUMENT_ATTRIBUTES</code> and then
     *        call <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_GetQuerySuggestions.html">GetQuerySuggestions</a>.
     *        If <code>Mode</code> to use query history is set to <code>ENABLED</code> when calling <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateQuerySuggestionsConfig.html"
     *        >UpdateQuerySuggestionsConfig</a> and <code>AttributeSuggestionsMode</code> to use fields/attributes is
     *        set to <code>ACTIVE</code>, and you haven't set your <code>SuggestionTypes</code> preference to
     *        <code>DOCUMENT_ATTRIBUTES</code>, then Amazon Kendra uses the query history.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttributeSuggestionsMode
     */

    public AttributeSuggestionsUpdateConfig withAttributeSuggestionsMode(AttributeSuggestionsMode attributeSuggestionsMode) {
        this.attributeSuggestionsMode = attributeSuggestionsMode.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSuggestableConfigList() != null)
            sb.append("SuggestableConfigList: ").append(getSuggestableConfigList()).append(",");
        if (getAttributeSuggestionsMode() != null)
            sb.append("AttributeSuggestionsMode: ").append(getAttributeSuggestionsMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttributeSuggestionsUpdateConfig == false)
            return false;
        AttributeSuggestionsUpdateConfig other = (AttributeSuggestionsUpdateConfig) obj;
        if (other.getSuggestableConfigList() == null ^ this.getSuggestableConfigList() == null)
            return false;
        if (other.getSuggestableConfigList() != null && other.getSuggestableConfigList().equals(this.getSuggestableConfigList()) == false)
            return false;
        if (other.getAttributeSuggestionsMode() == null ^ this.getAttributeSuggestionsMode() == null)
            return false;
        if (other.getAttributeSuggestionsMode() != null && other.getAttributeSuggestionsMode().equals(this.getAttributeSuggestionsMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuggestableConfigList() == null) ? 0 : getSuggestableConfigList().hashCode());
        hashCode = prime * hashCode + ((getAttributeSuggestionsMode() == null) ? 0 : getAttributeSuggestionsMode().hashCode());
        return hashCode;
    }

    @Override
    public AttributeSuggestionsUpdateConfig clone() {
        try {
            return (AttributeSuggestionsUpdateConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.AttributeSuggestionsUpdateConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
