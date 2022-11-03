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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/UpdateCase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCaseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier of the case.
     * </p>
     */
    private String caseId;
    /**
     * <p>
     * The unique identifier of the Cases domain.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * An array of objects with <code>fieldId</code> (matching ListFields/DescribeField) and value union data,
     * structured identical to <code>CreateCase</code>.
     * </p>
     */
    private java.util.List<FieldValue> fields;

    /**
     * <p>
     * A unique identifier of the case.
     * </p>
     * 
     * @param caseId
     *        A unique identifier of the case.
     */

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    /**
     * <p>
     * A unique identifier of the case.
     * </p>
     * 
     * @return A unique identifier of the case.
     */

    public String getCaseId() {
        return this.caseId;
    }

    /**
     * <p>
     * A unique identifier of the case.
     * </p>
     * 
     * @param caseId
     *        A unique identifier of the case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCaseRequest withCaseId(String caseId) {
        setCaseId(caseId);
        return this;
    }

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

    public UpdateCaseRequest withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * An array of objects with <code>fieldId</code> (matching ListFields/DescribeField) and value union data,
     * structured identical to <code>CreateCase</code>.
     * </p>
     * 
     * @return An array of objects with <code>fieldId</code> (matching ListFields/DescribeField) and value union data,
     *         structured identical to <code>CreateCase</code>.
     */

    public java.util.List<FieldValue> getFields() {
        return fields;
    }

    /**
     * <p>
     * An array of objects with <code>fieldId</code> (matching ListFields/DescribeField) and value union data,
     * structured identical to <code>CreateCase</code>.
     * </p>
     * 
     * @param fields
     *        An array of objects with <code>fieldId</code> (matching ListFields/DescribeField) and value union data,
     *        structured identical to <code>CreateCase</code>.
     */

    public void setFields(java.util.Collection<FieldValue> fields) {
        if (fields == null) {
            this.fields = null;
            return;
        }

        this.fields = new java.util.ArrayList<FieldValue>(fields);
    }

    /**
     * <p>
     * An array of objects with <code>fieldId</code> (matching ListFields/DescribeField) and value union data,
     * structured identical to <code>CreateCase</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFields(java.util.Collection)} or {@link #withFields(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param fields
     *        An array of objects with <code>fieldId</code> (matching ListFields/DescribeField) and value union data,
     *        structured identical to <code>CreateCase</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCaseRequest withFields(FieldValue... fields) {
        if (this.fields == null) {
            setFields(new java.util.ArrayList<FieldValue>(fields.length));
        }
        for (FieldValue ele : fields) {
            this.fields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects with <code>fieldId</code> (matching ListFields/DescribeField) and value union data,
     * structured identical to <code>CreateCase</code>.
     * </p>
     * 
     * @param fields
     *        An array of objects with <code>fieldId</code> (matching ListFields/DescribeField) and value union data,
     *        structured identical to <code>CreateCase</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCaseRequest withFields(java.util.Collection<FieldValue> fields) {
        setFields(fields);
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
        if (getCaseId() != null)
            sb.append("CaseId: ").append(getCaseId()).append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getFields() != null)
            sb.append("Fields: ").append(getFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCaseRequest == false)
            return false;
        UpdateCaseRequest other = (UpdateCaseRequest) obj;
        if (other.getCaseId() == null ^ this.getCaseId() == null)
            return false;
        if (other.getCaseId() != null && other.getCaseId().equals(this.getCaseId()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getFields() == null ^ this.getFields() == null)
            return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCaseId() == null) ? 0 : getCaseId().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCaseRequest clone() {
        return (UpdateCaseRequest) super.clone();
    }

}
