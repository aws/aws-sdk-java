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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateFpgaImageRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFpgaImageRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateFpgaImageRequest> {

    /**
     * <p>
     * The location of the encrypted design checkpoint in Amazon S3. The input must be a tarball.
     * </p>
     */
    private StorageLocation inputStorageLocation;
    /**
     * <p>
     * The location in Amazon S3 for the output logs.
     * </p>
     */
    private StorageLocation logsStorageLocation;
    /**
     * <p>
     * A description for the AFI.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A name for the AFI.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The location of the encrypted design checkpoint in Amazon S3. The input must be a tarball.
     * </p>
     * 
     * @param inputStorageLocation
     *        The location of the encrypted design checkpoint in Amazon S3. The input must be a tarball.
     */

    public void setInputStorageLocation(StorageLocation inputStorageLocation) {
        this.inputStorageLocation = inputStorageLocation;
    }

    /**
     * <p>
     * The location of the encrypted design checkpoint in Amazon S3. The input must be a tarball.
     * </p>
     * 
     * @return The location of the encrypted design checkpoint in Amazon S3. The input must be a tarball.
     */

    public StorageLocation getInputStorageLocation() {
        return this.inputStorageLocation;
    }

    /**
     * <p>
     * The location of the encrypted design checkpoint in Amazon S3. The input must be a tarball.
     * </p>
     * 
     * @param inputStorageLocation
     *        The location of the encrypted design checkpoint in Amazon S3. The input must be a tarball.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFpgaImageRequest withInputStorageLocation(StorageLocation inputStorageLocation) {
        setInputStorageLocation(inputStorageLocation);
        return this;
    }

    /**
     * <p>
     * The location in Amazon S3 for the output logs.
     * </p>
     * 
     * @param logsStorageLocation
     *        The location in Amazon S3 for the output logs.
     */

    public void setLogsStorageLocation(StorageLocation logsStorageLocation) {
        this.logsStorageLocation = logsStorageLocation;
    }

    /**
     * <p>
     * The location in Amazon S3 for the output logs.
     * </p>
     * 
     * @return The location in Amazon S3 for the output logs.
     */

    public StorageLocation getLogsStorageLocation() {
        return this.logsStorageLocation;
    }

    /**
     * <p>
     * The location in Amazon S3 for the output logs.
     * </p>
     * 
     * @param logsStorageLocation
     *        The location in Amazon S3 for the output logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFpgaImageRequest withLogsStorageLocation(StorageLocation logsStorageLocation) {
        setLogsStorageLocation(logsStorageLocation);
        return this;
    }

    /**
     * <p>
     * A description for the AFI.
     * </p>
     * 
     * @param description
     *        A description for the AFI.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the AFI.
     * </p>
     * 
     * @return A description for the AFI.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the AFI.
     * </p>
     * 
     * @param description
     *        A description for the AFI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFpgaImageRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A name for the AFI.
     * </p>
     * 
     * @param name
     *        A name for the AFI.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the AFI.
     * </p>
     * 
     * @return A name for the AFI.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the AFI.
     * </p>
     * 
     * @param name
     *        A name for the AFI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFpgaImageRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFpgaImageRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateFpgaImageRequest> getDryRunRequest() {
        Request<CreateFpgaImageRequest> request = new CreateFpgaImageRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getInputStorageLocation() != null)
            sb.append("InputStorageLocation: ").append(getInputStorageLocation()).append(",");
        if (getLogsStorageLocation() != null)
            sb.append("LogsStorageLocation: ").append(getLogsStorageLocation()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFpgaImageRequest == false)
            return false;
        CreateFpgaImageRequest other = (CreateFpgaImageRequest) obj;
        if (other.getInputStorageLocation() == null ^ this.getInputStorageLocation() == null)
            return false;
        if (other.getInputStorageLocation() != null && other.getInputStorageLocation().equals(this.getInputStorageLocation()) == false)
            return false;
        if (other.getLogsStorageLocation() == null ^ this.getLogsStorageLocation() == null)
            return false;
        if (other.getLogsStorageLocation() != null && other.getLogsStorageLocation().equals(this.getLogsStorageLocation()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputStorageLocation() == null) ? 0 : getInputStorageLocation().hashCode());
        hashCode = prime * hashCode + ((getLogsStorageLocation() == null) ? 0 : getLogsStorageLocation().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateFpgaImageRequest clone() {
        return (CreateFpgaImageRequest) super.clone();
    }
}
