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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.EnableImageBlockPublicAccessRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableImageBlockPublicAccessRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<EnableImageBlockPublicAccessRequest> {

    /**
     * <p>
     * Specify <code>block-new-sharing</code> to enable block public access for AMIs at the account level in the
     * specified Region. This will block any attempt to publicly share your AMIs in the specified Region.
     * </p>
     */
    private String imageBlockPublicAccessState;

    /**
     * <p>
     * Specify <code>block-new-sharing</code> to enable block public access for AMIs at the account level in the
     * specified Region. This will block any attempt to publicly share your AMIs in the specified Region.
     * </p>
     * 
     * @param imageBlockPublicAccessState
     *        Specify <code>block-new-sharing</code> to enable block public access for AMIs at the account level in the
     *        specified Region. This will block any attempt to publicly share your AMIs in the specified Region.
     * @see ImageBlockPublicAccessEnabledState
     */

    public void setImageBlockPublicAccessState(String imageBlockPublicAccessState) {
        this.imageBlockPublicAccessState = imageBlockPublicAccessState;
    }

    /**
     * <p>
     * Specify <code>block-new-sharing</code> to enable block public access for AMIs at the account level in the
     * specified Region. This will block any attempt to publicly share your AMIs in the specified Region.
     * </p>
     * 
     * @return Specify <code>block-new-sharing</code> to enable block public access for AMIs at the account level in the
     *         specified Region. This will block any attempt to publicly share your AMIs in the specified Region.
     * @see ImageBlockPublicAccessEnabledState
     */

    public String getImageBlockPublicAccessState() {
        return this.imageBlockPublicAccessState;
    }

    /**
     * <p>
     * Specify <code>block-new-sharing</code> to enable block public access for AMIs at the account level in the
     * specified Region. This will block any attempt to publicly share your AMIs in the specified Region.
     * </p>
     * 
     * @param imageBlockPublicAccessState
     *        Specify <code>block-new-sharing</code> to enable block public access for AMIs at the account level in the
     *        specified Region. This will block any attempt to publicly share your AMIs in the specified Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageBlockPublicAccessEnabledState
     */

    public EnableImageBlockPublicAccessRequest withImageBlockPublicAccessState(String imageBlockPublicAccessState) {
        setImageBlockPublicAccessState(imageBlockPublicAccessState);
        return this;
    }

    /**
     * <p>
     * Specify <code>block-new-sharing</code> to enable block public access for AMIs at the account level in the
     * specified Region. This will block any attempt to publicly share your AMIs in the specified Region.
     * </p>
     * 
     * @param imageBlockPublicAccessState
     *        Specify <code>block-new-sharing</code> to enable block public access for AMIs at the account level in the
     *        specified Region. This will block any attempt to publicly share your AMIs in the specified Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageBlockPublicAccessEnabledState
     */

    public EnableImageBlockPublicAccessRequest withImageBlockPublicAccessState(ImageBlockPublicAccessEnabledState imageBlockPublicAccessState) {
        this.imageBlockPublicAccessState = imageBlockPublicAccessState.toString();
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<EnableImageBlockPublicAccessRequest> getDryRunRequest() {
        Request<EnableImageBlockPublicAccessRequest> request = new EnableImageBlockPublicAccessRequestMarshaller().marshall(this);
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
        if (getImageBlockPublicAccessState() != null)
            sb.append("ImageBlockPublicAccessState: ").append(getImageBlockPublicAccessState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableImageBlockPublicAccessRequest == false)
            return false;
        EnableImageBlockPublicAccessRequest other = (EnableImageBlockPublicAccessRequest) obj;
        if (other.getImageBlockPublicAccessState() == null ^ this.getImageBlockPublicAccessState() == null)
            return false;
        if (other.getImageBlockPublicAccessState() != null && other.getImageBlockPublicAccessState().equals(this.getImageBlockPublicAccessState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageBlockPublicAccessState() == null) ? 0 : getImageBlockPublicAccessState().hashCode());
        return hashCode;
    }

    @Override
    public EnableImageBlockPublicAccessRequest clone() {
        return (EnableImageBlockPublicAccessRequest) super.clone();
    }
}
