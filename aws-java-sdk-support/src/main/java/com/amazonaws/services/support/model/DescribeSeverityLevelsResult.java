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

/**
 * <p>
 * The list of severity levels returned by the <a>DescribeSeverityLevels</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeSeverityLevels" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSeverityLevelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The available severity levels for the support case. Available severity levels are defined by your service level
     * agreement with AWS.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SeverityLevel> severityLevels;

    /**
     * <p>
     * The available severity levels for the support case. Available severity levels are defined by your service level
     * agreement with AWS.
     * </p>
     * 
     * @return The available severity levels for the support case. Available severity levels are defined by your service
     *         level agreement with AWS.
     */

    public java.util.List<SeverityLevel> getSeverityLevels() {
        if (severityLevels == null) {
            severityLevels = new com.amazonaws.internal.SdkInternalList<SeverityLevel>();
        }
        return severityLevels;
    }

    /**
     * <p>
     * The available severity levels for the support case. Available severity levels are defined by your service level
     * agreement with AWS.
     * </p>
     * 
     * @param severityLevels
     *        The available severity levels for the support case. Available severity levels are defined by your service
     *        level agreement with AWS.
     */

    public void setSeverityLevels(java.util.Collection<SeverityLevel> severityLevels) {
        if (severityLevels == null) {
            this.severityLevels = null;
            return;
        }

        this.severityLevels = new com.amazonaws.internal.SdkInternalList<SeverityLevel>(severityLevels);
    }

    /**
     * <p>
     * The available severity levels for the support case. Available severity levels are defined by your service level
     * agreement with AWS.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSeverityLevels(java.util.Collection)} or {@link #withSeverityLevels(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param severityLevels
     *        The available severity levels for the support case. Available severity levels are defined by your service
     *        level agreement with AWS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSeverityLevelsResult withSeverityLevels(SeverityLevel... severityLevels) {
        if (this.severityLevels == null) {
            setSeverityLevels(new com.amazonaws.internal.SdkInternalList<SeverityLevel>(severityLevels.length));
        }
        for (SeverityLevel ele : severityLevels) {
            this.severityLevels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The available severity levels for the support case. Available severity levels are defined by your service level
     * agreement with AWS.
     * </p>
     * 
     * @param severityLevels
     *        The available severity levels for the support case. Available severity levels are defined by your service
     *        level agreement with AWS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSeverityLevelsResult withSeverityLevels(java.util.Collection<SeverityLevel> severityLevels) {
        setSeverityLevels(severityLevels);
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
        if (getSeverityLevels() != null)
            sb.append("SeverityLevels: ").append(getSeverityLevels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSeverityLevelsResult == false)
            return false;
        DescribeSeverityLevelsResult other = (DescribeSeverityLevelsResult) obj;
        if (other.getSeverityLevels() == null ^ this.getSeverityLevels() == null)
            return false;
        if (other.getSeverityLevels() != null && other.getSeverityLevels().equals(this.getSeverityLevels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSeverityLevels() == null) ? 0 : getSeverityLevels().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSeverityLevelsResult clone() {
        try {
            return (DescribeSeverityLevelsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
