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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details about a specific DataSync discovery job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DiscoveryJobListEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DiscoveryJobListEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a discovery job.
     * </p>
     */
    private String discoveryJobArn;
    /**
     * <p>
     * The status of a discovery job. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#discovery-job-statuses-table"
     * >Discovery job statuses</a>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a discovery job.
     * </p>
     * 
     * @param discoveryJobArn
     *        The Amazon Resource Name (ARN) of a discovery job.
     */

    public void setDiscoveryJobArn(String discoveryJobArn) {
        this.discoveryJobArn = discoveryJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a discovery job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a discovery job.
     */

    public String getDiscoveryJobArn() {
        return this.discoveryJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a discovery job.
     * </p>
     * 
     * @param discoveryJobArn
     *        The Amazon Resource Name (ARN) of a discovery job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoveryJobListEntry withDiscoveryJobArn(String discoveryJobArn) {
        setDiscoveryJobArn(discoveryJobArn);
        return this;
    }

    /**
     * <p>
     * The status of a discovery job. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#discovery-job-statuses-table"
     * >Discovery job statuses</a>.
     * </p>
     * 
     * @param status
     *        The status of a discovery job. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#discovery-job-statuses-table"
     *        >Discovery job statuses</a>.
     * @see DiscoveryJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a discovery job. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#discovery-job-statuses-table"
     * >Discovery job statuses</a>.
     * </p>
     * 
     * @return The status of a discovery job. For more information, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#discovery-job-statuses-table"
     *         >Discovery job statuses</a>.
     * @see DiscoveryJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a discovery job. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#discovery-job-statuses-table"
     * >Discovery job statuses</a>.
     * </p>
     * 
     * @param status
     *        The status of a discovery job. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#discovery-job-statuses-table"
     *        >Discovery job statuses</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiscoveryJobStatus
     */

    public DiscoveryJobListEntry withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a discovery job. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#discovery-job-statuses-table"
     * >Discovery job statuses</a>.
     * </p>
     * 
     * @param status
     *        The status of a discovery job. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-job-statuses.html#discovery-job-statuses-table"
     *        >Discovery job statuses</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiscoveryJobStatus
     */

    public DiscoveryJobListEntry withStatus(DiscoveryJobStatus status) {
        this.status = status.toString();
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
        if (getDiscoveryJobArn() != null)
            sb.append("DiscoveryJobArn: ").append(getDiscoveryJobArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DiscoveryJobListEntry == false)
            return false;
        DiscoveryJobListEntry other = (DiscoveryJobListEntry) obj;
        if (other.getDiscoveryJobArn() == null ^ this.getDiscoveryJobArn() == null)
            return false;
        if (other.getDiscoveryJobArn() != null && other.getDiscoveryJobArn().equals(this.getDiscoveryJobArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDiscoveryJobArn() == null) ? 0 : getDiscoveryJobArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DiscoveryJobListEntry clone() {
        try {
            return (DiscoveryJobListEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.DiscoveryJobListEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
