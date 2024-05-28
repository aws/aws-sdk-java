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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Indicates the resources that have drifted in the current application version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ResourceDrift" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceDrift implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the application whose resources have drifted. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>.
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     */
    private String appArn;
    /**
     * <p>
     * Version of the application whose resources have drifted.
     * </p>
     */
    private String appVersion;
    /**
     * <p>
     * Indicates if the resource was added or removed.
     * </p>
     */
    private String diffType;
    /**
     * <p>
     * Reference identifier of the resource drift.
     * </p>
     */
    private String referenceId;
    /**
     * <p>
     * Identifier of the drifted resource.
     * </p>
     */
    private ResourceIdentifier resourceIdentifier;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the application whose resources have drifted. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>.
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @param appArn
     *        Amazon Resource Name (ARN) of the application whose resources have drifted. The format for this ARN is:
     *        arn:<code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app-assessment/
     *        <code>app-id</code>. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     */

    public void setAppArn(String appArn) {
        this.appArn = appArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the application whose resources have drifted. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>.
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the application whose resources have drifted. The format for this ARN is:
     *         arn:<code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app-assessment/
     *         <code>app-id</code>. For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *         (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     */

    public String getAppArn() {
        return this.appArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the application whose resources have drifted. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>.
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @param appArn
     *        Amazon Resource Name (ARN) of the application whose resources have drifted. The format for this ARN is:
     *        arn:<code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app-assessment/
     *        <code>app-id</code>. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDrift withAppArn(String appArn) {
        setAppArn(appArn);
        return this;
    }

    /**
     * <p>
     * Version of the application whose resources have drifted.
     * </p>
     * 
     * @param appVersion
     *        Version of the application whose resources have drifted.
     */

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    /**
     * <p>
     * Version of the application whose resources have drifted.
     * </p>
     * 
     * @return Version of the application whose resources have drifted.
     */

    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * <p>
     * Version of the application whose resources have drifted.
     * </p>
     * 
     * @param appVersion
     *        Version of the application whose resources have drifted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDrift withAppVersion(String appVersion) {
        setAppVersion(appVersion);
        return this;
    }

    /**
     * <p>
     * Indicates if the resource was added or removed.
     * </p>
     * 
     * @param diffType
     *        Indicates if the resource was added or removed.
     * @see DifferenceType
     */

    public void setDiffType(String diffType) {
        this.diffType = diffType;
    }

    /**
     * <p>
     * Indicates if the resource was added or removed.
     * </p>
     * 
     * @return Indicates if the resource was added or removed.
     * @see DifferenceType
     */

    public String getDiffType() {
        return this.diffType;
    }

    /**
     * <p>
     * Indicates if the resource was added or removed.
     * </p>
     * 
     * @param diffType
     *        Indicates if the resource was added or removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DifferenceType
     */

    public ResourceDrift withDiffType(String diffType) {
        setDiffType(diffType);
        return this;
    }

    /**
     * <p>
     * Indicates if the resource was added or removed.
     * </p>
     * 
     * @param diffType
     *        Indicates if the resource was added or removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DifferenceType
     */

    public ResourceDrift withDiffType(DifferenceType diffType) {
        this.diffType = diffType.toString();
        return this;
    }

    /**
     * <p>
     * Reference identifier of the resource drift.
     * </p>
     * 
     * @param referenceId
     *        Reference identifier of the resource drift.
     */

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * <p>
     * Reference identifier of the resource drift.
     * </p>
     * 
     * @return Reference identifier of the resource drift.
     */

    public String getReferenceId() {
        return this.referenceId;
    }

    /**
     * <p>
     * Reference identifier of the resource drift.
     * </p>
     * 
     * @param referenceId
     *        Reference identifier of the resource drift.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDrift withReferenceId(String referenceId) {
        setReferenceId(referenceId);
        return this;
    }

    /**
     * <p>
     * Identifier of the drifted resource.
     * </p>
     * 
     * @param resourceIdentifier
     *        Identifier of the drifted resource.
     */

    public void setResourceIdentifier(ResourceIdentifier resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * Identifier of the drifted resource.
     * </p>
     * 
     * @return Identifier of the drifted resource.
     */

    public ResourceIdentifier getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * <p>
     * Identifier of the drifted resource.
     * </p>
     * 
     * @param resourceIdentifier
     *        Identifier of the drifted resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDrift withResourceIdentifier(ResourceIdentifier resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
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
        if (getAppArn() != null)
            sb.append("AppArn: ").append(getAppArn()).append(",");
        if (getAppVersion() != null)
            sb.append("AppVersion: ").append(getAppVersion()).append(",");
        if (getDiffType() != null)
            sb.append("DiffType: ").append(getDiffType()).append(",");
        if (getReferenceId() != null)
            sb.append("ReferenceId: ").append(getReferenceId()).append(",");
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceDrift == false)
            return false;
        ResourceDrift other = (ResourceDrift) obj;
        if (other.getAppArn() == null ^ this.getAppArn() == null)
            return false;
        if (other.getAppArn() != null && other.getAppArn().equals(this.getAppArn()) == false)
            return false;
        if (other.getAppVersion() == null ^ this.getAppVersion() == null)
            return false;
        if (other.getAppVersion() != null && other.getAppVersion().equals(this.getAppVersion()) == false)
            return false;
        if (other.getDiffType() == null ^ this.getDiffType() == null)
            return false;
        if (other.getDiffType() != null && other.getDiffType().equals(this.getDiffType()) == false)
            return false;
        if (other.getReferenceId() == null ^ this.getReferenceId() == null)
            return false;
        if (other.getReferenceId() != null && other.getReferenceId().equals(this.getReferenceId()) == false)
            return false;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppArn() == null) ? 0 : getAppArn().hashCode());
        hashCode = prime * hashCode + ((getAppVersion() == null) ? 0 : getAppVersion().hashCode());
        hashCode = prime * hashCode + ((getDiffType() == null) ? 0 : getDiffType().hashCode());
        hashCode = prime * hashCode + ((getReferenceId() == null) ? 0 : getReferenceId().hashCode());
        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public ResourceDrift clone() {
        try {
            return (ResourceDrift) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.ResourceDriftMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
