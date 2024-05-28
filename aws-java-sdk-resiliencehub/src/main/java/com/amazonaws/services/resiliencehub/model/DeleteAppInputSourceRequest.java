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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DeleteAppInputSource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAppInputSourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     */
    private String appArn;
    /**
     * <p>
     * Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII characters.
     * You should not reuse the same client token for other API requests.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The namespace on your Amazon Elastic Kubernetes Service cluster that you want to delete from the Resilience Hub
     * application.
     * </p>
     */
    private EksSourceClusterNamespace eksSourceClusterNamespace;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the imported resource you want to remove from the Resilience Hub application.
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     */
    private String sourceArn;
    /**
     * <p>
     * The imported Terraform s3 state ﬁle you want to remove from the Resilience Hub application.
     * </p>
     */
    private TerraformSource terraformSource;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @param appArn
     *        Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     *        <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For
     *        more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     */

    public void setAppArn(String appArn) {
        this.appArn = appArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     *         <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>.
     *         For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *         (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     */

    public String getAppArn() {
        return this.appArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @param appArn
     *        Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     *        <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For
     *        more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAppInputSourceRequest withAppArn(String appArn) {
        setAppArn(appArn);
        return this;
    }

    /**
     * <p>
     * Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII characters.
     * You should not reuse the same client token for other API requests.
     * </p>
     * 
     * @param clientToken
     *        Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII
     *        characters. You should not reuse the same client token for other API requests.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII characters.
     * You should not reuse the same client token for other API requests.
     * </p>
     * 
     * @return Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII
     *         characters. You should not reuse the same client token for other API requests.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII characters.
     * You should not reuse the same client token for other API requests.
     * </p>
     * 
     * @param clientToken
     *        Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII
     *        characters. You should not reuse the same client token for other API requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAppInputSourceRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The namespace on your Amazon Elastic Kubernetes Service cluster that you want to delete from the Resilience Hub
     * application.
     * </p>
     * 
     * @param eksSourceClusterNamespace
     *        The namespace on your Amazon Elastic Kubernetes Service cluster that you want to delete from the
     *        Resilience Hub application.
     */

    public void setEksSourceClusterNamespace(EksSourceClusterNamespace eksSourceClusterNamespace) {
        this.eksSourceClusterNamespace = eksSourceClusterNamespace;
    }

    /**
     * <p>
     * The namespace on your Amazon Elastic Kubernetes Service cluster that you want to delete from the Resilience Hub
     * application.
     * </p>
     * 
     * @return The namespace on your Amazon Elastic Kubernetes Service cluster that you want to delete from the
     *         Resilience Hub application.
     */

    public EksSourceClusterNamespace getEksSourceClusterNamespace() {
        return this.eksSourceClusterNamespace;
    }

    /**
     * <p>
     * The namespace on your Amazon Elastic Kubernetes Service cluster that you want to delete from the Resilience Hub
     * application.
     * </p>
     * 
     * @param eksSourceClusterNamespace
     *        The namespace on your Amazon Elastic Kubernetes Service cluster that you want to delete from the
     *        Resilience Hub application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAppInputSourceRequest withEksSourceClusterNamespace(EksSourceClusterNamespace eksSourceClusterNamespace) {
        setEksSourceClusterNamespace(eksSourceClusterNamespace);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the imported resource you want to remove from the Resilience Hub application.
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) of the imported resource you want to remove from the Resilience Hub
     *        application. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the imported resource you want to remove from the Resilience Hub application.
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the imported resource you want to remove from the Resilience Hub
     *         application. For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *         (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the imported resource you want to remove from the Resilience Hub application.
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) of the imported resource you want to remove from the Resilience Hub
     *        application. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAppInputSourceRequest withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * The imported Terraform s3 state ﬁle you want to remove from the Resilience Hub application.
     * </p>
     * 
     * @param terraformSource
     *        The imported Terraform s3 state ﬁle you want to remove from the Resilience Hub application.
     */

    public void setTerraformSource(TerraformSource terraformSource) {
        this.terraformSource = terraformSource;
    }

    /**
     * <p>
     * The imported Terraform s3 state ﬁle you want to remove from the Resilience Hub application.
     * </p>
     * 
     * @return The imported Terraform s3 state ﬁle you want to remove from the Resilience Hub application.
     */

    public TerraformSource getTerraformSource() {
        return this.terraformSource;
    }

    /**
     * <p>
     * The imported Terraform s3 state ﬁle you want to remove from the Resilience Hub application.
     * </p>
     * 
     * @param terraformSource
     *        The imported Terraform s3 state ﬁle you want to remove from the Resilience Hub application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAppInputSourceRequest withTerraformSource(TerraformSource terraformSource) {
        setTerraformSource(terraformSource);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getEksSourceClusterNamespace() != null)
            sb.append("EksSourceClusterNamespace: ").append(getEksSourceClusterNamespace()).append(",");
        if (getSourceArn() != null)
            sb.append("SourceArn: ").append(getSourceArn()).append(",");
        if (getTerraformSource() != null)
            sb.append("TerraformSource: ").append(getTerraformSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAppInputSourceRequest == false)
            return false;
        DeleteAppInputSourceRequest other = (DeleteAppInputSourceRequest) obj;
        if (other.getAppArn() == null ^ this.getAppArn() == null)
            return false;
        if (other.getAppArn() != null && other.getAppArn().equals(this.getAppArn()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getEksSourceClusterNamespace() == null ^ this.getEksSourceClusterNamespace() == null)
            return false;
        if (other.getEksSourceClusterNamespace() != null && other.getEksSourceClusterNamespace().equals(this.getEksSourceClusterNamespace()) == false)
            return false;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getTerraformSource() == null ^ this.getTerraformSource() == null)
            return false;
        if (other.getTerraformSource() != null && other.getTerraformSource().equals(this.getTerraformSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppArn() == null) ? 0 : getAppArn().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getEksSourceClusterNamespace() == null) ? 0 : getEksSourceClusterNamespace().hashCode());
        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getTerraformSource() == null) ? 0 : getTerraformSource().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAppInputSourceRequest clone() {
        return (DeleteAppInputSourceRequest) super.clone();
    }

}
