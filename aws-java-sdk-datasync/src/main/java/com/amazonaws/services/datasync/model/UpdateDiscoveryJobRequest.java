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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateDiscoveryJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDiscoveryJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the discovery job that you want to update.
     * </p>
     */
    private String discoveryJobArn;
    /**
     * <p>
     * Specifies in minutes how long that you want the discovery job to run. (You can't set this parameter to less than
     * the number of minutes that the job has already run for.)
     * </p>
     */
    private Integer collectionDurationMinutes;

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the discovery job that you want to update.
     * </p>
     * 
     * @param discoveryJobArn
     *        Specifies the Amazon Resource Name (ARN) of the discovery job that you want to update.
     */

    public void setDiscoveryJobArn(String discoveryJobArn) {
        this.discoveryJobArn = discoveryJobArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the discovery job that you want to update.
     * </p>
     * 
     * @return Specifies the Amazon Resource Name (ARN) of the discovery job that you want to update.
     */

    public String getDiscoveryJobArn() {
        return this.discoveryJobArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the discovery job that you want to update.
     * </p>
     * 
     * @param discoveryJobArn
     *        Specifies the Amazon Resource Name (ARN) of the discovery job that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDiscoveryJobRequest withDiscoveryJobArn(String discoveryJobArn) {
        setDiscoveryJobArn(discoveryJobArn);
        return this;
    }

    /**
     * <p>
     * Specifies in minutes how long that you want the discovery job to run. (You can't set this parameter to less than
     * the number of minutes that the job has already run for.)
     * </p>
     * 
     * @param collectionDurationMinutes
     *        Specifies in minutes how long that you want the discovery job to run. (You can't set this parameter to
     *        less than the number of minutes that the job has already run for.)
     */

    public void setCollectionDurationMinutes(Integer collectionDurationMinutes) {
        this.collectionDurationMinutes = collectionDurationMinutes;
    }

    /**
     * <p>
     * Specifies in minutes how long that you want the discovery job to run. (You can't set this parameter to less than
     * the number of minutes that the job has already run for.)
     * </p>
     * 
     * @return Specifies in minutes how long that you want the discovery job to run. (You can't set this parameter to
     *         less than the number of minutes that the job has already run for.)
     */

    public Integer getCollectionDurationMinutes() {
        return this.collectionDurationMinutes;
    }

    /**
     * <p>
     * Specifies in minutes how long that you want the discovery job to run. (You can't set this parameter to less than
     * the number of minutes that the job has already run for.)
     * </p>
     * 
     * @param collectionDurationMinutes
     *        Specifies in minutes how long that you want the discovery job to run. (You can't set this parameter to
     *        less than the number of minutes that the job has already run for.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDiscoveryJobRequest withCollectionDurationMinutes(Integer collectionDurationMinutes) {
        setCollectionDurationMinutes(collectionDurationMinutes);
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
        if (getCollectionDurationMinutes() != null)
            sb.append("CollectionDurationMinutes: ").append(getCollectionDurationMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDiscoveryJobRequest == false)
            return false;
        UpdateDiscoveryJobRequest other = (UpdateDiscoveryJobRequest) obj;
        if (other.getDiscoveryJobArn() == null ^ this.getDiscoveryJobArn() == null)
            return false;
        if (other.getDiscoveryJobArn() != null && other.getDiscoveryJobArn().equals(this.getDiscoveryJobArn()) == false)
            return false;
        if (other.getCollectionDurationMinutes() == null ^ this.getCollectionDurationMinutes() == null)
            return false;
        if (other.getCollectionDurationMinutes() != null && other.getCollectionDurationMinutes().equals(this.getCollectionDurationMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDiscoveryJobArn() == null) ? 0 : getDiscoveryJobArn().hashCode());
        hashCode = prime * hashCode + ((getCollectionDurationMinutes() == null) ? 0 : getCollectionDurationMinutes().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDiscoveryJobRequest clone() {
        return (UpdateDiscoveryJobRequest) super.clone();
    }

}
