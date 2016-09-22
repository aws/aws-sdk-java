/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class PublishVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Lambda function name. You can specify a function name (for example, <code>Thumbnail</code>) or you can
     * specify Amazon Resource Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS Lambda also allows you to specify a
     * partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the length constraint applies only to the
     * ARN. If you specify only the function name, it is limited to 64 character in length.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * The SHA256 hash of the deployment package you want to publish. This provides validation on the code you are
     * publishing. If you provide this parameter value must match the SHA256 of the $LATEST version for the publication
     * to succeed.
     * </p>
     */
    private String codeSha256;
    /**
     * <p>
     * The description for the version you are publishing. If not provided, AWS Lambda copies the description from the
     * $LATEST version.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The Lambda function name. You can specify a function name (for example, <code>Thumbnail</code>) or you can
     * specify Amazon Resource Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS Lambda also allows you to specify a
     * partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the length constraint applies only to the
     * ARN. If you specify only the function name, it is limited to 64 character in length.
     * </p>
     * 
     * @param functionName
     *        The Lambda function name. You can specify a function name (for example, <code>Thumbnail</code>) or you can
     *        specify Amazon Resource Name (ARN) of the function (for example,
     *        <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS Lambda also allows you to
     *        specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the length constraint
     *        applies only to the ARN. If you specify only the function name, it is limited to 64 character in length.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The Lambda function name. You can specify a function name (for example, <code>Thumbnail</code>) or you can
     * specify Amazon Resource Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS Lambda also allows you to specify a
     * partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the length constraint applies only to the
     * ARN. If you specify only the function name, it is limited to 64 character in length.
     * </p>
     * 
     * @return The Lambda function name. You can specify a function name (for example, <code>Thumbnail</code>) or you
     *         can specify Amazon Resource Name (ARN) of the function (for example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS Lambda also allows you to
     *         specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the length constraint
     *         applies only to the ARN. If you specify only the function name, it is limited to 64 character in length.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The Lambda function name. You can specify a function name (for example, <code>Thumbnail</code>) or you can
     * specify Amazon Resource Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS Lambda also allows you to specify a
     * partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the length constraint applies only to the
     * ARN. If you specify only the function name, it is limited to 64 character in length.
     * </p>
     * 
     * @param functionName
     *        The Lambda function name. You can specify a function name (for example, <code>Thumbnail</code>) or you can
     *        specify Amazon Resource Name (ARN) of the function (for example,
     *        <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS Lambda also allows you to
     *        specify a partial ARN (for example, <code>account-id:Thumbnail</code>). Note that the length constraint
     *        applies only to the ARN. If you specify only the function name, it is limited to 64 character in length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishVersionRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * The SHA256 hash of the deployment package you want to publish. This provides validation on the code you are
     * publishing. If you provide this parameter value must match the SHA256 of the $LATEST version for the publication
     * to succeed.
     * </p>
     * 
     * @param codeSha256
     *        The SHA256 hash of the deployment package you want to publish. This provides validation on the code you
     *        are publishing. If you provide this parameter value must match the SHA256 of the $LATEST version for the
     *        publication to succeed.
     */

    public void setCodeSha256(String codeSha256) {
        this.codeSha256 = codeSha256;
    }

    /**
     * <p>
     * The SHA256 hash of the deployment package you want to publish. This provides validation on the code you are
     * publishing. If you provide this parameter value must match the SHA256 of the $LATEST version for the publication
     * to succeed.
     * </p>
     * 
     * @return The SHA256 hash of the deployment package you want to publish. This provides validation on the code you
     *         are publishing. If you provide this parameter value must match the SHA256 of the $LATEST version for the
     *         publication to succeed.
     */

    public String getCodeSha256() {
        return this.codeSha256;
    }

    /**
     * <p>
     * The SHA256 hash of the deployment package you want to publish. This provides validation on the code you are
     * publishing. If you provide this parameter value must match the SHA256 of the $LATEST version for the publication
     * to succeed.
     * </p>
     * 
     * @param codeSha256
     *        The SHA256 hash of the deployment package you want to publish. This provides validation on the code you
     *        are publishing. If you provide this parameter value must match the SHA256 of the $LATEST version for the
     *        publication to succeed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishVersionRequest withCodeSha256(String codeSha256) {
        setCodeSha256(codeSha256);
        return this;
    }

    /**
     * <p>
     * The description for the version you are publishing. If not provided, AWS Lambda copies the description from the
     * $LATEST version.
     * </p>
     * 
     * @param description
     *        The description for the version you are publishing. If not provided, AWS Lambda copies the description
     *        from the $LATEST version.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the version you are publishing. If not provided, AWS Lambda copies the description from the
     * $LATEST version.
     * </p>
     * 
     * @return The description for the version you are publishing. If not provided, AWS Lambda copies the description
     *         from the $LATEST version.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the version you are publishing. If not provided, AWS Lambda copies the description from the
     * $LATEST version.
     * </p>
     * 
     * @param description
     *        The description for the version you are publishing. If not provided, AWS Lambda copies the description
     *        from the $LATEST version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishVersionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFunctionName() != null)
            sb.append("FunctionName: " + getFunctionName() + ",");
        if (getCodeSha256() != null)
            sb.append("CodeSha256: " + getCodeSha256() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublishVersionRequest == false)
            return false;
        PublishVersionRequest other = (PublishVersionRequest) obj;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getCodeSha256() == null ^ this.getCodeSha256() == null)
            return false;
        if (other.getCodeSha256() != null && other.getCodeSha256().equals(this.getCodeSha256()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getCodeSha256() == null) ? 0 : getCodeSha256().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public PublishVersionRequest clone() {
        return (PublishVersionRequest) super.clone();
    }
}
