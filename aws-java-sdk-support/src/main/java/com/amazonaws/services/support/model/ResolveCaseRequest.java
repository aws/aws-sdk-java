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
package com.amazonaws.services.support.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/ResolveCase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResolveCaseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as
     * shown in this example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     */
    private String caseId;

    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as
     * shown in this example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     * 
     * @param caseId
     *        The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted
     *        as shown in this example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     */

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as
     * shown in this example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     * 
     * @return The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string
     *         formatted as shown in this example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     */

    public String getCaseId() {
        return this.caseId;
    }

    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as
     * shown in this example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     * 
     * @param caseId
     *        The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted
     *        as shown in this example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolveCaseRequest withCaseId(String caseId) {
        setCaseId(caseId);
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
            sb.append("CaseId: ").append(getCaseId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResolveCaseRequest == false)
            return false;
        ResolveCaseRequest other = (ResolveCaseRequest) obj;
        if (other.getCaseId() == null ^ this.getCaseId() == null)
            return false;
        if (other.getCaseId() != null && other.getCaseId().equals(this.getCaseId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCaseId() == null) ? 0 : getCaseId().hashCode());
        return hashCode;
    }

    @Override
    public ResolveCaseRequest clone() {
        return (ResolveCaseRequest) super.clone();
    }

}
