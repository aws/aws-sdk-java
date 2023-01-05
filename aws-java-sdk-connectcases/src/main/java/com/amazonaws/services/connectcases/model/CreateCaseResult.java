/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateCase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCaseResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the case.
     * </p>
     */
    private String caseArn;
    /**
     * <p>
     * A unique identifier of the case.
     * </p>
     */
    private String caseId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the case.
     * </p>
     * 
     * @param caseArn
     *        The Amazon Resource Name (ARN) of the case.
     */

    public void setCaseArn(String caseArn) {
        this.caseArn = caseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the case.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the case.
     */

    public String getCaseArn() {
        return this.caseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the case.
     * </p>
     * 
     * @param caseArn
     *        The Amazon Resource Name (ARN) of the case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCaseResult withCaseArn(String caseArn) {
        setCaseArn(caseArn);
        return this;
    }

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

    public CreateCaseResult withCaseId(String caseId) {
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
        if (getCaseArn() != null)
            sb.append("CaseArn: ").append(getCaseArn()).append(",");
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

        if (obj instanceof CreateCaseResult == false)
            return false;
        CreateCaseResult other = (CreateCaseResult) obj;
        if (other.getCaseArn() == null ^ this.getCaseArn() == null)
            return false;
        if (other.getCaseArn() != null && other.getCaseArn().equals(this.getCaseArn()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getCaseArn() == null) ? 0 : getCaseArn().hashCode());
        hashCode = prime * hashCode + ((getCaseId() == null) ? 0 : getCaseId().hashCode());
        return hashCode;
    }

    @Override
    public CreateCaseResult clone() {
        try {
            return (CreateCaseResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
