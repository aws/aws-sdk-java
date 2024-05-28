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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Use this parameter to specify a supported global condition key that is added to the IAM policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/IamPolicyConstraints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IamPolicyConstraints implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * When <code>SourceIp</code> is <code>Enabled</code> the worker's IP address when a task is rendered in the worker
     * portal is added to the IAM policy as a <code>Condition</code> used to generate the Amazon S3 presigned URL. This
     * IP address is checked by Amazon S3 and must match in order for the Amazon S3 resource to be rendered in the
     * worker portal.
     * </p>
     */
    private String sourceIp;
    /**
     * <p>
     * When <code>VpcSourceIp</code> is <code>Enabled</code> the worker's IP address when a task is rendered in private
     * worker portal inside the VPC is added to the IAM policy as a <code>Condition</code> used to generate the Amazon
     * S3 presigned URL. To render the task successfully Amazon S3 checks that the presigned URL is being accessed over
     * an Amazon S3 VPC Endpoint, and that the worker's IP address matches the IP address in the IAM policy. To learn
     * more about configuring private worker portal, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/samurai-vpc-worker-portal.html">Use Amazon VPC mode from a
     * private worker portal</a>.
     * </p>
     */
    private String vpcSourceIp;

    /**
     * <p>
     * When <code>SourceIp</code> is <code>Enabled</code> the worker's IP address when a task is rendered in the worker
     * portal is added to the IAM policy as a <code>Condition</code> used to generate the Amazon S3 presigned URL. This
     * IP address is checked by Amazon S3 and must match in order for the Amazon S3 resource to be rendered in the
     * worker portal.
     * </p>
     * 
     * @param sourceIp
     *        When <code>SourceIp</code> is <code>Enabled</code> the worker's IP address when a task is rendered in the
     *        worker portal is added to the IAM policy as a <code>Condition</code> used to generate the Amazon S3
     *        presigned URL. This IP address is checked by Amazon S3 and must match in order for the Amazon S3 resource
     *        to be rendered in the worker portal.
     * @see EnabledOrDisabled
     */

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    /**
     * <p>
     * When <code>SourceIp</code> is <code>Enabled</code> the worker's IP address when a task is rendered in the worker
     * portal is added to the IAM policy as a <code>Condition</code> used to generate the Amazon S3 presigned URL. This
     * IP address is checked by Amazon S3 and must match in order for the Amazon S3 resource to be rendered in the
     * worker portal.
     * </p>
     * 
     * @return When <code>SourceIp</code> is <code>Enabled</code> the worker's IP address when a task is rendered in the
     *         worker portal is added to the IAM policy as a <code>Condition</code> used to generate the Amazon S3
     *         presigned URL. This IP address is checked by Amazon S3 and must match in order for the Amazon S3 resource
     *         to be rendered in the worker portal.
     * @see EnabledOrDisabled
     */

    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * <p>
     * When <code>SourceIp</code> is <code>Enabled</code> the worker's IP address when a task is rendered in the worker
     * portal is added to the IAM policy as a <code>Condition</code> used to generate the Amazon S3 presigned URL. This
     * IP address is checked by Amazon S3 and must match in order for the Amazon S3 resource to be rendered in the
     * worker portal.
     * </p>
     * 
     * @param sourceIp
     *        When <code>SourceIp</code> is <code>Enabled</code> the worker's IP address when a task is rendered in the
     *        worker portal is added to the IAM policy as a <code>Condition</code> used to generate the Amazon S3
     *        presigned URL. This IP address is checked by Amazon S3 and must match in order for the Amazon S3 resource
     *        to be rendered in the worker portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnabledOrDisabled
     */

    public IamPolicyConstraints withSourceIp(String sourceIp) {
        setSourceIp(sourceIp);
        return this;
    }

    /**
     * <p>
     * When <code>SourceIp</code> is <code>Enabled</code> the worker's IP address when a task is rendered in the worker
     * portal is added to the IAM policy as a <code>Condition</code> used to generate the Amazon S3 presigned URL. This
     * IP address is checked by Amazon S3 and must match in order for the Amazon S3 resource to be rendered in the
     * worker portal.
     * </p>
     * 
     * @param sourceIp
     *        When <code>SourceIp</code> is <code>Enabled</code> the worker's IP address when a task is rendered in the
     *        worker portal is added to the IAM policy as a <code>Condition</code> used to generate the Amazon S3
     *        presigned URL. This IP address is checked by Amazon S3 and must match in order for the Amazon S3 resource
     *        to be rendered in the worker portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnabledOrDisabled
     */

    public IamPolicyConstraints withSourceIp(EnabledOrDisabled sourceIp) {
        this.sourceIp = sourceIp.toString();
        return this;
    }

    /**
     * <p>
     * When <code>VpcSourceIp</code> is <code>Enabled</code> the worker's IP address when a task is rendered in private
     * worker portal inside the VPC is added to the IAM policy as a <code>Condition</code> used to generate the Amazon
     * S3 presigned URL. To render the task successfully Amazon S3 checks that the presigned URL is being accessed over
     * an Amazon S3 VPC Endpoint, and that the worker's IP address matches the IP address in the IAM policy. To learn
     * more about configuring private worker portal, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/samurai-vpc-worker-portal.html">Use Amazon VPC mode from a
     * private worker portal</a>.
     * </p>
     * 
     * @param vpcSourceIp
     *        When <code>VpcSourceIp</code> is <code>Enabled</code> the worker's IP address when a task is rendered in
     *        private worker portal inside the VPC is added to the IAM policy as a <code>Condition</code> used to
     *        generate the Amazon S3 presigned URL. To render the task successfully Amazon S3 checks that the presigned
     *        URL is being accessed over an Amazon S3 VPC Endpoint, and that the worker's IP address matches the IP
     *        address in the IAM policy. To learn more about configuring private worker portal, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/samurai-vpc-worker-portal.html">Use Amazon VPC mode
     *        from a private worker portal</a>.
     * @see EnabledOrDisabled
     */

    public void setVpcSourceIp(String vpcSourceIp) {
        this.vpcSourceIp = vpcSourceIp;
    }

    /**
     * <p>
     * When <code>VpcSourceIp</code> is <code>Enabled</code> the worker's IP address when a task is rendered in private
     * worker portal inside the VPC is added to the IAM policy as a <code>Condition</code> used to generate the Amazon
     * S3 presigned URL. To render the task successfully Amazon S3 checks that the presigned URL is being accessed over
     * an Amazon S3 VPC Endpoint, and that the worker's IP address matches the IP address in the IAM policy. To learn
     * more about configuring private worker portal, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/samurai-vpc-worker-portal.html">Use Amazon VPC mode from a
     * private worker portal</a>.
     * </p>
     * 
     * @return When <code>VpcSourceIp</code> is <code>Enabled</code> the worker's IP address when a task is rendered in
     *         private worker portal inside the VPC is added to the IAM policy as a <code>Condition</code> used to
     *         generate the Amazon S3 presigned URL. To render the task successfully Amazon S3 checks that the presigned
     *         URL is being accessed over an Amazon S3 VPC Endpoint, and that the worker's IP address matches the IP
     *         address in the IAM policy. To learn more about configuring private worker portal, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/samurai-vpc-worker-portal.html">Use Amazon VPC mode
     *         from a private worker portal</a>.
     * @see EnabledOrDisabled
     */

    public String getVpcSourceIp() {
        return this.vpcSourceIp;
    }

    /**
     * <p>
     * When <code>VpcSourceIp</code> is <code>Enabled</code> the worker's IP address when a task is rendered in private
     * worker portal inside the VPC is added to the IAM policy as a <code>Condition</code> used to generate the Amazon
     * S3 presigned URL. To render the task successfully Amazon S3 checks that the presigned URL is being accessed over
     * an Amazon S3 VPC Endpoint, and that the worker's IP address matches the IP address in the IAM policy. To learn
     * more about configuring private worker portal, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/samurai-vpc-worker-portal.html">Use Amazon VPC mode from a
     * private worker portal</a>.
     * </p>
     * 
     * @param vpcSourceIp
     *        When <code>VpcSourceIp</code> is <code>Enabled</code> the worker's IP address when a task is rendered in
     *        private worker portal inside the VPC is added to the IAM policy as a <code>Condition</code> used to
     *        generate the Amazon S3 presigned URL. To render the task successfully Amazon S3 checks that the presigned
     *        URL is being accessed over an Amazon S3 VPC Endpoint, and that the worker's IP address matches the IP
     *        address in the IAM policy. To learn more about configuring private worker portal, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/samurai-vpc-worker-portal.html">Use Amazon VPC mode
     *        from a private worker portal</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnabledOrDisabled
     */

    public IamPolicyConstraints withVpcSourceIp(String vpcSourceIp) {
        setVpcSourceIp(vpcSourceIp);
        return this;
    }

    /**
     * <p>
     * When <code>VpcSourceIp</code> is <code>Enabled</code> the worker's IP address when a task is rendered in private
     * worker portal inside the VPC is added to the IAM policy as a <code>Condition</code> used to generate the Amazon
     * S3 presigned URL. To render the task successfully Amazon S3 checks that the presigned URL is being accessed over
     * an Amazon S3 VPC Endpoint, and that the worker's IP address matches the IP address in the IAM policy. To learn
     * more about configuring private worker portal, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/samurai-vpc-worker-portal.html">Use Amazon VPC mode from a
     * private worker portal</a>.
     * </p>
     * 
     * @param vpcSourceIp
     *        When <code>VpcSourceIp</code> is <code>Enabled</code> the worker's IP address when a task is rendered in
     *        private worker portal inside the VPC is added to the IAM policy as a <code>Condition</code> used to
     *        generate the Amazon S3 presigned URL. To render the task successfully Amazon S3 checks that the presigned
     *        URL is being accessed over an Amazon S3 VPC Endpoint, and that the worker's IP address matches the IP
     *        address in the IAM policy. To learn more about configuring private worker portal, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/samurai-vpc-worker-portal.html">Use Amazon VPC mode
     *        from a private worker portal</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnabledOrDisabled
     */

    public IamPolicyConstraints withVpcSourceIp(EnabledOrDisabled vpcSourceIp) {
        this.vpcSourceIp = vpcSourceIp.toString();
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
        if (getSourceIp() != null)
            sb.append("SourceIp: ").append(getSourceIp()).append(",");
        if (getVpcSourceIp() != null)
            sb.append("VpcSourceIp: ").append(getVpcSourceIp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IamPolicyConstraints == false)
            return false;
        IamPolicyConstraints other = (IamPolicyConstraints) obj;
        if (other.getSourceIp() == null ^ this.getSourceIp() == null)
            return false;
        if (other.getSourceIp() != null && other.getSourceIp().equals(this.getSourceIp()) == false)
            return false;
        if (other.getVpcSourceIp() == null ^ this.getVpcSourceIp() == null)
            return false;
        if (other.getVpcSourceIp() != null && other.getVpcSourceIp().equals(this.getVpcSourceIp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceIp() == null) ? 0 : getSourceIp().hashCode());
        hashCode = prime * hashCode + ((getVpcSourceIp() == null) ? 0 : getVpcSourceIp().hashCode());
        return hashCode;
    }

    @Override
    public IamPolicyConstraints clone() {
        try {
            return (IamPolicyConstraints) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.IamPolicyConstraintsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
