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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Segment type containing a list of detected issues.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/RealTimeContactAnalysisSegmentIssues"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RealTimeContactAnalysisSegmentIssues implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of the issues detected.
     * </p>
     */
    private java.util.List<RealTimeContactAnalysisIssueDetected> issuesDetected;

    /**
     * <p>
     * List of the issues detected.
     * </p>
     * 
     * @return List of the issues detected.
     */

    public java.util.List<RealTimeContactAnalysisIssueDetected> getIssuesDetected() {
        return issuesDetected;
    }

    /**
     * <p>
     * List of the issues detected.
     * </p>
     * 
     * @param issuesDetected
     *        List of the issues detected.
     */

    public void setIssuesDetected(java.util.Collection<RealTimeContactAnalysisIssueDetected> issuesDetected) {
        if (issuesDetected == null) {
            this.issuesDetected = null;
            return;
        }

        this.issuesDetected = new java.util.ArrayList<RealTimeContactAnalysisIssueDetected>(issuesDetected);
    }

    /**
     * <p>
     * List of the issues detected.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIssuesDetected(java.util.Collection)} or {@link #withIssuesDetected(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param issuesDetected
     *        List of the issues detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeContactAnalysisSegmentIssues withIssuesDetected(RealTimeContactAnalysisIssueDetected... issuesDetected) {
        if (this.issuesDetected == null) {
            setIssuesDetected(new java.util.ArrayList<RealTimeContactAnalysisIssueDetected>(issuesDetected.length));
        }
        for (RealTimeContactAnalysisIssueDetected ele : issuesDetected) {
            this.issuesDetected.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of the issues detected.
     * </p>
     * 
     * @param issuesDetected
     *        List of the issues detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeContactAnalysisSegmentIssues withIssuesDetected(java.util.Collection<RealTimeContactAnalysisIssueDetected> issuesDetected) {
        setIssuesDetected(issuesDetected);
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
        if (getIssuesDetected() != null)
            sb.append("IssuesDetected: ").append(getIssuesDetected());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RealTimeContactAnalysisSegmentIssues == false)
            return false;
        RealTimeContactAnalysisSegmentIssues other = (RealTimeContactAnalysisSegmentIssues) obj;
        if (other.getIssuesDetected() == null ^ this.getIssuesDetected() == null)
            return false;
        if (other.getIssuesDetected() != null && other.getIssuesDetected().equals(this.getIssuesDetected()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIssuesDetected() == null) ? 0 : getIssuesDetected().hashCode());
        return hashCode;
    }

    @Override
    public RealTimeContactAnalysisSegmentIssues clone() {
        try {
            return (RealTimeContactAnalysisSegmentIssues) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.RealTimeContactAnalysisSegmentIssuesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
