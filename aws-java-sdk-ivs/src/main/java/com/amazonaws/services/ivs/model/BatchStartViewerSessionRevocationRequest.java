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
package com.amazonaws.services.ivs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/BatchStartViewerSessionRevocation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchStartViewerSessionRevocationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Array of viewer sessions, one per channel-ARN and viewer-ID pair.
     * </p>
     */
    private java.util.List<BatchStartViewerSessionRevocationViewerSession> viewerSessions;

    /**
     * <p>
     * Array of viewer sessions, one per channel-ARN and viewer-ID pair.
     * </p>
     * 
     * @return Array of viewer sessions, one per channel-ARN and viewer-ID pair.
     */

    public java.util.List<BatchStartViewerSessionRevocationViewerSession> getViewerSessions() {
        return viewerSessions;
    }

    /**
     * <p>
     * Array of viewer sessions, one per channel-ARN and viewer-ID pair.
     * </p>
     * 
     * @param viewerSessions
     *        Array of viewer sessions, one per channel-ARN and viewer-ID pair.
     */

    public void setViewerSessions(java.util.Collection<BatchStartViewerSessionRevocationViewerSession> viewerSessions) {
        if (viewerSessions == null) {
            this.viewerSessions = null;
            return;
        }

        this.viewerSessions = new java.util.ArrayList<BatchStartViewerSessionRevocationViewerSession>(viewerSessions);
    }

    /**
     * <p>
     * Array of viewer sessions, one per channel-ARN and viewer-ID pair.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setViewerSessions(java.util.Collection)} or {@link #withViewerSessions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param viewerSessions
     *        Array of viewer sessions, one per channel-ARN and viewer-ID pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStartViewerSessionRevocationRequest withViewerSessions(BatchStartViewerSessionRevocationViewerSession... viewerSessions) {
        if (this.viewerSessions == null) {
            setViewerSessions(new java.util.ArrayList<BatchStartViewerSessionRevocationViewerSession>(viewerSessions.length));
        }
        for (BatchStartViewerSessionRevocationViewerSession ele : viewerSessions) {
            this.viewerSessions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Array of viewer sessions, one per channel-ARN and viewer-ID pair.
     * </p>
     * 
     * @param viewerSessions
     *        Array of viewer sessions, one per channel-ARN and viewer-ID pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStartViewerSessionRevocationRequest withViewerSessions(java.util.Collection<BatchStartViewerSessionRevocationViewerSession> viewerSessions) {
        setViewerSessions(viewerSessions);
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
        if (getViewerSessions() != null)
            sb.append("ViewerSessions: ").append(getViewerSessions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchStartViewerSessionRevocationRequest == false)
            return false;
        BatchStartViewerSessionRevocationRequest other = (BatchStartViewerSessionRevocationRequest) obj;
        if (other.getViewerSessions() == null ^ this.getViewerSessions() == null)
            return false;
        if (other.getViewerSessions() != null && other.getViewerSessions().equals(this.getViewerSessions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getViewerSessions() == null) ? 0 : getViewerSessions().hashCode());
        return hashCode;
    }

    @Override
    public BatchStartViewerSessionRevocationRequest clone() {
        return (BatchStartViewerSessionRevocationRequest) super.clone();
    }

}
