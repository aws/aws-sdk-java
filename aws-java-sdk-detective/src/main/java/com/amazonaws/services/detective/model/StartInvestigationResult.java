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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/StartInvestigation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartInvestigationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The investigation ID of the investigation report.
     * </p>
     */
    private String investigationId;

    /**
     * <p>
     * The investigation ID of the investigation report.
     * </p>
     * 
     * @param investigationId
     *        The investigation ID of the investigation report.
     */

    public void setInvestigationId(String investigationId) {
        this.investigationId = investigationId;
    }

    /**
     * <p>
     * The investigation ID of the investigation report.
     * </p>
     * 
     * @return The investigation ID of the investigation report.
     */

    public String getInvestigationId() {
        return this.investigationId;
    }

    /**
     * <p>
     * The investigation ID of the investigation report.
     * </p>
     * 
     * @param investigationId
     *        The investigation ID of the investigation report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartInvestigationResult withInvestigationId(String investigationId) {
        setInvestigationId(investigationId);
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
        if (getInvestigationId() != null)
            sb.append("InvestigationId: ").append(getInvestigationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartInvestigationResult == false)
            return false;
        StartInvestigationResult other = (StartInvestigationResult) obj;
        if (other.getInvestigationId() == null ^ this.getInvestigationId() == null)
            return false;
        if (other.getInvestigationId() != null && other.getInvestigationId().equals(this.getInvestigationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInvestigationId() == null) ? 0 : getInvestigationId().hashCode());
        return hashCode;
    }

    @Override
    public StartInvestigationResult clone() {
        try {
            return (StartInvestigationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
