/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DeleteApp" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAppRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
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
     * A boolean option to force the deletion of a Resilience Hub application.
     * </p>
     */
    private Boolean forceDelete;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param appArn
     *        The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     *        :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information
     *        about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     *        Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public void setAppArn(String appArn) {
        this.appArn = appArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     *         :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information
     *         about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     *         Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public String getAppArn() {
        return this.appArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param appArn
     *        The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     *        :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information
     *        about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     *        Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAppRequest withAppArn(String appArn) {
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

    public DeleteAppRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A boolean option to force the deletion of a Resilience Hub application.
     * </p>
     * 
     * @param forceDelete
     *        A boolean option to force the deletion of a Resilience Hub application.
     */

    public void setForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
    }

    /**
     * <p>
     * A boolean option to force the deletion of a Resilience Hub application.
     * </p>
     * 
     * @return A boolean option to force the deletion of a Resilience Hub application.
     */

    public Boolean getForceDelete() {
        return this.forceDelete;
    }

    /**
     * <p>
     * A boolean option to force the deletion of a Resilience Hub application.
     * </p>
     * 
     * @param forceDelete
     *        A boolean option to force the deletion of a Resilience Hub application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAppRequest withForceDelete(Boolean forceDelete) {
        setForceDelete(forceDelete);
        return this;
    }

    /**
     * <p>
     * A boolean option to force the deletion of a Resilience Hub application.
     * </p>
     * 
     * @return A boolean option to force the deletion of a Resilience Hub application.
     */

    public Boolean isForceDelete() {
        return this.forceDelete;
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
        if (getForceDelete() != null)
            sb.append("ForceDelete: ").append(getForceDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAppRequest == false)
            return false;
        DeleteAppRequest other = (DeleteAppRequest) obj;
        if (other.getAppArn() == null ^ this.getAppArn() == null)
            return false;
        if (other.getAppArn() != null && other.getAppArn().equals(this.getAppArn()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getForceDelete() == null ^ this.getForceDelete() == null)
            return false;
        if (other.getForceDelete() != null && other.getForceDelete().equals(this.getForceDelete()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppArn() == null) ? 0 : getAppArn().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getForceDelete() == null) ? 0 : getForceDelete().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAppRequest clone() {
        return (DeleteAppRequest) super.clone();
    }

}
