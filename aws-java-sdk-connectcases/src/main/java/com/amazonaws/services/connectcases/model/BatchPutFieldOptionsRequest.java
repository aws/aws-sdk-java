/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/BatchPutFieldOptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchPutFieldOptionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the Cases domain.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The unique identifier of a field.
     * </p>
     */
    private String fieldId;
    /**
     * <p>
     * A list of <code>FieldOption</code> objects.
     * </p>
     */
    private java.util.List<FieldOption> options;

    /**
     * <p>
     * The unique identifier of the Cases domain.
     * </p>
     * 
     * @param domainId
     *        The unique identifier of the Cases domain.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The unique identifier of the Cases domain.
     * </p>
     * 
     * @return The unique identifier of the Cases domain.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The unique identifier of the Cases domain.
     * </p>
     * 
     * @param domainId
     *        The unique identifier of the Cases domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutFieldOptionsRequest withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of a field.
     * </p>
     * 
     * @param fieldId
     *        The unique identifier of a field.
     */

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    /**
     * <p>
     * The unique identifier of a field.
     * </p>
     * 
     * @return The unique identifier of a field.
     */

    public String getFieldId() {
        return this.fieldId;
    }

    /**
     * <p>
     * The unique identifier of a field.
     * </p>
     * 
     * @param fieldId
     *        The unique identifier of a field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutFieldOptionsRequest withFieldId(String fieldId) {
        setFieldId(fieldId);
        return this;
    }

    /**
     * <p>
     * A list of <code>FieldOption</code> objects.
     * </p>
     * 
     * @return A list of <code>FieldOption</code> objects.
     */

    public java.util.List<FieldOption> getOptions() {
        return options;
    }

    /**
     * <p>
     * A list of <code>FieldOption</code> objects.
     * </p>
     * 
     * @param options
     *        A list of <code>FieldOption</code> objects.
     */

    public void setOptions(java.util.Collection<FieldOption> options) {
        if (options == null) {
            this.options = null;
            return;
        }

        this.options = new java.util.ArrayList<FieldOption>(options);
    }

    /**
     * <p>
     * A list of <code>FieldOption</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptions(java.util.Collection)} or {@link #withOptions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param options
     *        A list of <code>FieldOption</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutFieldOptionsRequest withOptions(FieldOption... options) {
        if (this.options == null) {
            setOptions(new java.util.ArrayList<FieldOption>(options.length));
        }
        for (FieldOption ele : options) {
            this.options.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>FieldOption</code> objects.
     * </p>
     * 
     * @param options
     *        A list of <code>FieldOption</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutFieldOptionsRequest withOptions(java.util.Collection<FieldOption> options) {
        setOptions(options);
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
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getFieldId() != null)
            sb.append("FieldId: ").append(getFieldId()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchPutFieldOptionsRequest == false)
            return false;
        BatchPutFieldOptionsRequest other = (BatchPutFieldOptionsRequest) obj;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getFieldId() == null ^ this.getFieldId() == null)
            return false;
        if (other.getFieldId() != null && other.getFieldId().equals(this.getFieldId()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getFieldId() == null) ? 0 : getFieldId().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        return hashCode;
    }

    @Override
    public BatchPutFieldOptionsRequest clone() {
        return (BatchPutFieldOptionsRequest) super.clone();
    }

}
