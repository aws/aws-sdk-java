/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetTriggers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetTriggersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of trigger names, which may be the names returned from the <code>ListTriggers</code> operation.
     * </p>
     */
    private java.util.List<String> triggerNames;

    /**
     * <p>
     * A list of trigger names, which may be the names returned from the <code>ListTriggers</code> operation.
     * </p>
     * 
     * @return A list of trigger names, which may be the names returned from the <code>ListTriggers</code> operation.
     */

    public java.util.List<String> getTriggerNames() {
        return triggerNames;
    }

    /**
     * <p>
     * A list of trigger names, which may be the names returned from the <code>ListTriggers</code> operation.
     * </p>
     * 
     * @param triggerNames
     *        A list of trigger names, which may be the names returned from the <code>ListTriggers</code> operation.
     */

    public void setTriggerNames(java.util.Collection<String> triggerNames) {
        if (triggerNames == null) {
            this.triggerNames = null;
            return;
        }

        this.triggerNames = new java.util.ArrayList<String>(triggerNames);
    }

    /**
     * <p>
     * A list of trigger names, which may be the names returned from the <code>ListTriggers</code> operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTriggerNames(java.util.Collection)} or {@link #withTriggerNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param triggerNames
     *        A list of trigger names, which may be the names returned from the <code>ListTriggers</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetTriggersRequest withTriggerNames(String... triggerNames) {
        if (this.triggerNames == null) {
            setTriggerNames(new java.util.ArrayList<String>(triggerNames.length));
        }
        for (String ele : triggerNames) {
            this.triggerNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of trigger names, which may be the names returned from the <code>ListTriggers</code> operation.
     * </p>
     * 
     * @param triggerNames
     *        A list of trigger names, which may be the names returned from the <code>ListTriggers</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetTriggersRequest withTriggerNames(java.util.Collection<String> triggerNames) {
        setTriggerNames(triggerNames);
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
        if (getTriggerNames() != null)
            sb.append("TriggerNames: ").append(getTriggerNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetTriggersRequest == false)
            return false;
        BatchGetTriggersRequest other = (BatchGetTriggersRequest) obj;
        if (other.getTriggerNames() == null ^ this.getTriggerNames() == null)
            return false;
        if (other.getTriggerNames() != null && other.getTriggerNames().equals(this.getTriggerNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTriggerNames() == null) ? 0 : getTriggerNames().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetTriggersRequest clone() {
        return (BatchGetTriggersRequest) super.clone();
    }

}
