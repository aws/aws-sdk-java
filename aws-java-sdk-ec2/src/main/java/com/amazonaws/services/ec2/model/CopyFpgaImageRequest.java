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
import com.amazonaws.services.ec2.model.transform.CopyFpgaImageRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyFpgaImageRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CopyFpgaImageRequest> {

    /**
     * <p>
     * The ID of the source AFI.
     * </p>
     */
    private String sourceFpgaImageId;
    /**
     * <p>
     * The description for the new AFI.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name for the new AFI. The default is the name of the source AFI.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The region that contains the source AFI.
     * </p>
     */
    private String sourceRegion;
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
     * The ID of the source AFI.
     * </p>
     * 
     * @param sourceFpgaImageId
     *        The ID of the source AFI.
     */

    public void setSourceFpgaImageId(String sourceFpgaImageId) {
        this.sourceFpgaImageId = sourceFpgaImageId;
    }

    /**
     * <p>
     * The ID of the source AFI.
     * </p>
     * 
     * @return The ID of the source AFI.
     */

    public String getSourceFpgaImageId() {
        return this.sourceFpgaImageId;
    }

    /**
     * <p>
     * The ID of the source AFI.
     * </p>
     * 
     * @param sourceFpgaImageId
     *        The ID of the source AFI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyFpgaImageRequest withSourceFpgaImageId(String sourceFpgaImageId) {
        setSourceFpgaImageId(sourceFpgaImageId);
        return this;
    }

    /**
     * <p>
     * The description for the new AFI.
     * </p>
     * 
     * @param description
     *        The description for the new AFI.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the new AFI.
     * </p>
     * 
     * @return The description for the new AFI.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the new AFI.
     * </p>
     * 
     * @param description
     *        The description for the new AFI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyFpgaImageRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name for the new AFI. The default is the name of the source AFI.
     * </p>
     * 
     * @param name
     *        The name for the new AFI. The default is the name of the source AFI.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the new AFI. The default is the name of the source AFI.
     * </p>
     * 
     * @return The name for the new AFI. The default is the name of the source AFI.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the new AFI. The default is the name of the source AFI.
     * </p>
     * 
     * @param name
     *        The name for the new AFI. The default is the name of the source AFI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyFpgaImageRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The region that contains the source AFI.
     * </p>
     * 
     * @param sourceRegion
     *        The region that contains the source AFI.
     */

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    /**
     * <p>
     * The region that contains the source AFI.
     * </p>
     * 
     * @return The region that contains the source AFI.
     */

    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * <p>
     * The region that contains the source AFI.
     * </p>
     * 
     * @param sourceRegion
     *        The region that contains the source AFI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyFpgaImageRequest withSourceRegion(String sourceRegion) {
        setSourceRegion(sourceRegion);
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

    public CopyFpgaImageRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CopyFpgaImageRequest> getDryRunRequest() {
        Request<CopyFpgaImageRequest> request = new CopyFpgaImageRequestMarshaller().marshall(this);
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
        if (getSourceFpgaImageId() != null)
            sb.append("SourceFpgaImageId: ").append(getSourceFpgaImageId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSourceRegion() != null)
            sb.append("SourceRegion: ").append(getSourceRegion()).append(",");
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

        if (obj instanceof CopyFpgaImageRequest == false)
            return false;
        CopyFpgaImageRequest other = (CopyFpgaImageRequest) obj;
        if (other.getSourceFpgaImageId() == null ^ this.getSourceFpgaImageId() == null)
            return false;
        if (other.getSourceFpgaImageId() != null && other.getSourceFpgaImageId().equals(this.getSourceFpgaImageId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null)
            return false;
        if (other.getSourceRegion() != null && other.getSourceRegion().equals(this.getSourceRegion()) == false)
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

        hashCode = prime * hashCode + ((getSourceFpgaImageId() == null) ? 0 : getSourceFpgaImageId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CopyFpgaImageRequest clone() {
        return (CopyFpgaImageRequest) super.clone();
    }
}
