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
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to SubscribeToDatasetRequest.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/SubscribeToDataset" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubscribeToDatasetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. The
     * ID of the pool to which the identity belongs.
     * </p>
     */
    private String identityPoolId;
    /**
     * <p>
     * Unique ID for this identity.
     * </p>
     */
    private String identityId;
    /**
     * <p>
     * The name of the dataset to subcribe to.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * The unique ID generated for this device by Cognito.
     * </p>
     */
    private String deviceId;

    /**
     * <p>
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. The
     * ID of the pool to which the identity belongs.
     * </p>
     * 
     * @param identityPoolId
     *        A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *        Cognito. The ID of the pool to which the identity belongs.
     */

    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    /**
     * <p>
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. The
     * ID of the pool to which the identity belongs.
     * </p>
     * 
     * @return A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. The ID of the pool to which the identity belongs.
     */

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    /**
     * <p>
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. The
     * ID of the pool to which the identity belongs.
     * </p>
     * 
     * @param identityPoolId
     *        A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *        Cognito. The ID of the pool to which the identity belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribeToDatasetRequest withIdentityPoolId(String identityPoolId) {
        setIdentityPoolId(identityPoolId);
        return this;
    }

    /**
     * <p>
     * Unique ID for this identity.
     * </p>
     * 
     * @param identityId
     *        Unique ID for this identity.
     */

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    /**
     * <p>
     * Unique ID for this identity.
     * </p>
     * 
     * @return Unique ID for this identity.
     */

    public String getIdentityId() {
        return this.identityId;
    }

    /**
     * <p>
     * Unique ID for this identity.
     * </p>
     * 
     * @param identityId
     *        Unique ID for this identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribeToDatasetRequest withIdentityId(String identityId) {
        setIdentityId(identityId);
        return this;
    }

    /**
     * <p>
     * The name of the dataset to subcribe to.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset to subcribe to.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * The name of the dataset to subcribe to.
     * </p>
     * 
     * @return The name of the dataset to subcribe to.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * The name of the dataset to subcribe to.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset to subcribe to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribeToDatasetRequest withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * The unique ID generated for this device by Cognito.
     * </p>
     * 
     * @param deviceId
     *        The unique ID generated for this device by Cognito.
     */

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The unique ID generated for this device by Cognito.
     * </p>
     * 
     * @return The unique ID generated for this device by Cognito.
     */

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * <p>
     * The unique ID generated for this device by Cognito.
     * </p>
     * 
     * @param deviceId
     *        The unique ID generated for this device by Cognito.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribeToDatasetRequest withDeviceId(String deviceId) {
        setDeviceId(deviceId);
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
        if (getIdentityPoolId() != null)
            sb.append("IdentityPoolId: ").append(getIdentityPoolId()).append(",");
        if (getIdentityId() != null)
            sb.append("IdentityId: ").append(getIdentityId()).append(",");
        if (getDatasetName() != null)
            sb.append("DatasetName: ").append(getDatasetName()).append(",");
        if (getDeviceId() != null)
            sb.append("DeviceId: ").append(getDeviceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubscribeToDatasetRequest == false)
            return false;
        SubscribeToDatasetRequest other = (SubscribeToDatasetRequest) obj;
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
            return false;
        if (other.getIdentityId() == null ^ this.getIdentityId() == null)
            return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false)
            return false;
        if (other.getDatasetName() == null ^ this.getDatasetName() == null)
            return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false)
            return false;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode());
        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode());
        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        return hashCode;
    }

    @Override
    public SubscribeToDatasetRequest clone() {
        return (SubscribeToDatasetRequest) super.clone();
    }

}
