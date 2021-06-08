/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A configuration used when creating an Object Lambda Access Point transformation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ObjectLambdaTransformationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ObjectLambdaTransformationConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * A container for the action of an Object Lambda Access Point configuration. Valid input is <code>GetObject</code>.
     * </p>
     */
    private java.util.List<String> actions;
    /**
     * <p>
     * A container for the content transformation of an Object Lambda Access Point configuration.
     * </p>
     */
    private ObjectLambdaContentTransformation contentTransformation;

    /**
     * <p>
     * A container for the action of an Object Lambda Access Point configuration. Valid input is <code>GetObject</code>.
     * </p>
     * 
     * @return A container for the action of an Object Lambda Access Point configuration. Valid input is
     *         <code>GetObject</code>.
     * @see ObjectLambdaTransformationConfigurationAction
     */

    public java.util.List<String> getActions() {
        return actions;
    }

    /**
     * <p>
     * A container for the action of an Object Lambda Access Point configuration. Valid input is <code>GetObject</code>.
     * </p>
     * 
     * @param actions
     *        A container for the action of an Object Lambda Access Point configuration. Valid input is
     *        <code>GetObject</code>.
     * @see ObjectLambdaTransformationConfigurationAction
     */

    public void setActions(java.util.Collection<String> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<String>(actions);
    }

    /**
     * <p>
     * A container for the action of an Object Lambda Access Point configuration. Valid input is <code>GetObject</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        A container for the action of an Object Lambda Access Point configuration. Valid input is
     *        <code>GetObject</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectLambdaTransformationConfigurationAction
     */

    public ObjectLambdaTransformationConfiguration withActions(String... actions) {
        if (this.actions == null) {
            setActions(new java.util.ArrayList<String>(actions.length));
        }
        for (String ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A container for the action of an Object Lambda Access Point configuration. Valid input is <code>GetObject</code>.
     * </p>
     * 
     * @param actions
     *        A container for the action of an Object Lambda Access Point configuration. Valid input is
     *        <code>GetObject</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectLambdaTransformationConfigurationAction
     */

    public ObjectLambdaTransformationConfiguration withActions(java.util.Collection<String> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * A container for the action of an Object Lambda Access Point configuration. Valid input is <code>GetObject</code>.
     * </p>
     * 
     * @param actions
     *        A container for the action of an Object Lambda Access Point configuration. Valid input is
     *        <code>GetObject</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectLambdaTransformationConfigurationAction
     */

    public ObjectLambdaTransformationConfiguration withActions(ObjectLambdaTransformationConfigurationAction... actions) {
        java.util.ArrayList<String> actionsCopy = new java.util.ArrayList<String>(actions.length);
        for (ObjectLambdaTransformationConfigurationAction value : actions) {
            actionsCopy.add(value.toString());
        }
        if (getActions() == null) {
            setActions(actionsCopy);
        } else {
            getActions().addAll(actionsCopy);
        }
        return this;
    }

    /**
     * <p>
     * A container for the content transformation of an Object Lambda Access Point configuration.
     * </p>
     * 
     * @param contentTransformation
     *        A container for the content transformation of an Object Lambda Access Point configuration.
     */

    public void setContentTransformation(ObjectLambdaContentTransformation contentTransformation) {
        this.contentTransformation = contentTransformation;
    }

    /**
     * <p>
     * A container for the content transformation of an Object Lambda Access Point configuration.
     * </p>
     * 
     * @return A container for the content transformation of an Object Lambda Access Point configuration.
     */

    public ObjectLambdaContentTransformation getContentTransformation() {
        return this.contentTransformation;
    }

    /**
     * <p>
     * A container for the content transformation of an Object Lambda Access Point configuration.
     * </p>
     * 
     * @param contentTransformation
     *        A container for the content transformation of an Object Lambda Access Point configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectLambdaTransformationConfiguration withContentTransformation(ObjectLambdaContentTransformation contentTransformation) {
        setContentTransformation(contentTransformation);
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
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getContentTransformation() != null)
            sb.append("ContentTransformation: ").append(getContentTransformation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ObjectLambdaTransformationConfiguration == false)
            return false;
        ObjectLambdaTransformationConfiguration other = (ObjectLambdaTransformationConfiguration) obj;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getContentTransformation() == null ^ this.getContentTransformation() == null)
            return false;
        if (other.getContentTransformation() != null && other.getContentTransformation().equals(this.getContentTransformation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getContentTransformation() == null) ? 0 : getContentTransformation().hashCode());
        return hashCode;
    }

    @Override
    public ObjectLambdaTransformationConfiguration clone() {
        try {
            return (ObjectLambdaTransformationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
