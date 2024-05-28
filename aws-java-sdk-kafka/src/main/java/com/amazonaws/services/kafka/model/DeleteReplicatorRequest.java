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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/DeleteReplicator" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteReplicatorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The current version of the replicator.
     * </p>
     */
    private String currentVersion;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicator to be deleted.
     * </p>
     */
    private String replicatorArn;

    /**
     * <p>
     * The current version of the replicator.
     * </p>
     * 
     * @param currentVersion
     *        The current version of the replicator.
     */

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * <p>
     * The current version of the replicator.
     * </p>
     * 
     * @return The current version of the replicator.
     */

    public String getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * <p>
     * The current version of the replicator.
     * </p>
     * 
     * @param currentVersion
     *        The current version of the replicator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteReplicatorRequest withCurrentVersion(String currentVersion) {
        setCurrentVersion(currentVersion);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicator to be deleted.
     * </p>
     * 
     * @param replicatorArn
     *        The Amazon Resource Name (ARN) of the replicator to be deleted.
     */

    public void setReplicatorArn(String replicatorArn) {
        this.replicatorArn = replicatorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicator to be deleted.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the replicator to be deleted.
     */

    public String getReplicatorArn() {
        return this.replicatorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicator to be deleted.
     * </p>
     * 
     * @param replicatorArn
     *        The Amazon Resource Name (ARN) of the replicator to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteReplicatorRequest withReplicatorArn(String replicatorArn) {
        setReplicatorArn(replicatorArn);
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
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: ").append(getCurrentVersion()).append(",");
        if (getReplicatorArn() != null)
            sb.append("ReplicatorArn: ").append(getReplicatorArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteReplicatorRequest == false)
            return false;
        DeleteReplicatorRequest other = (DeleteReplicatorRequest) obj;
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
            return false;
        if (other.getReplicatorArn() == null ^ this.getReplicatorArn() == null)
            return false;
        if (other.getReplicatorArn() != null && other.getReplicatorArn().equals(this.getReplicatorArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        hashCode = prime * hashCode + ((getReplicatorArn() == null) ? 0 : getReplicatorArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteReplicatorRequest clone() {
        return (DeleteReplicatorRequest) super.clone();
    }

}
