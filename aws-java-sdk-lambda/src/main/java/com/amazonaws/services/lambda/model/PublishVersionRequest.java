/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.lambda.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.lambda.AWSLambda#publishVersion(PublishVersionRequest) PublishVersion operation}.
 * <p>
 * Publishes a version of your function from the current snapshot of
 * $LATEST. That is, AWS Lambda takes a snapshot of the function code and
 * configuration information from $LATEST and publishes a new version.
 * The code and configuration cannot be modified after publication. For
 * information about the versioning feature, see
 * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.lambda.AWSLambda#publishVersion(PublishVersionRequest)
 */
public class PublishVersionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The Lambda function name. You can specify a function name (for
     * example, <code>Thumbnail</code>) or you can specify Amazon Resource
     * Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * AWS Lambda also allows you to specify a partial ARN (for example,
     * <code>account-id:Thumbnail</code>). Note that the length constraint
     * applies only to the ARN. If you specify only the function name, it is
     * limited to 64 character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     */
    private String functionName;

    /**
     * The SHA256 hash of the deployment package you want to publish. This
     * provides validation on the code you are publishing. If you provide
     * this parameter value must match the SHA256 of the $LATEST version for
     * the publication to succeed.
     */
    private String codeSha256;

    /**
     * The description for the version you are publishing. If not provided,
     * AWS Lambda copies the description from the $LATEST version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String description;

    /**
     * The Lambda function name. You can specify a function name (for
     * example, <code>Thumbnail</code>) or you can specify Amazon Resource
     * Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * AWS Lambda also allows you to specify a partial ARN (for example,
     * <code>account-id:Thumbnail</code>). Note that the length constraint
     * applies only to the ARN. If you specify only the function name, it is
     * limited to 64 character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @return The Lambda function name. You can specify a function name (for
     *         example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *         Name (ARN) of the function (for example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     *         AWS Lambda also allows you to specify a partial ARN (for example,
     *         <code>account-id:Thumbnail</code>). Note that the length constraint
     *         applies only to the ARN. If you specify only the function name, it is
     *         limited to 64 character in length.
     */
    public String getFunctionName() {
        return functionName;
    }
    
    /**
     * The Lambda function name. You can specify a function name (for
     * example, <code>Thumbnail</code>) or you can specify Amazon Resource
     * Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * AWS Lambda also allows you to specify a partial ARN (for example,
     * <code>account-id:Thumbnail</code>). Note that the length constraint
     * applies only to the ARN. If you specify only the function name, it is
     * limited to 64 character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param functionName The Lambda function name. You can specify a function name (for
     *         example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *         Name (ARN) of the function (for example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     *         AWS Lambda also allows you to specify a partial ARN (for example,
     *         <code>account-id:Thumbnail</code>). Note that the length constraint
     *         applies only to the ARN. If you specify only the function name, it is
     *         limited to 64 character in length.
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
    
    /**
     * The Lambda function name. You can specify a function name (for
     * example, <code>Thumbnail</code>) or you can specify Amazon Resource
     * Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * AWS Lambda also allows you to specify a partial ARN (for example,
     * <code>account-id:Thumbnail</code>). Note that the length constraint
     * applies only to the ARN. If you specify only the function name, it is
     * limited to 64 character in length.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param functionName The Lambda function name. You can specify a function name (for
     *         example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *         Name (ARN) of the function (for example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     *         AWS Lambda also allows you to specify a partial ARN (for example,
     *         <code>account-id:Thumbnail</code>). Note that the length constraint
     *         applies only to the ARN. If you specify only the function name, it is
     *         limited to 64 character in length.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PublishVersionRequest withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * The SHA256 hash of the deployment package you want to publish. This
     * provides validation on the code you are publishing. If you provide
     * this parameter value must match the SHA256 of the $LATEST version for
     * the publication to succeed.
     *
     * @return The SHA256 hash of the deployment package you want to publish. This
     *         provides validation on the code you are publishing. If you provide
     *         this parameter value must match the SHA256 of the $LATEST version for
     *         the publication to succeed.
     */
    public String getCodeSha256() {
        return codeSha256;
    }
    
    /**
     * The SHA256 hash of the deployment package you want to publish. This
     * provides validation on the code you are publishing. If you provide
     * this parameter value must match the SHA256 of the $LATEST version for
     * the publication to succeed.
     *
     * @param codeSha256 The SHA256 hash of the deployment package you want to publish. This
     *         provides validation on the code you are publishing. If you provide
     *         this parameter value must match the SHA256 of the $LATEST version for
     *         the publication to succeed.
     */
    public void setCodeSha256(String codeSha256) {
        this.codeSha256 = codeSha256;
    }
    
    /**
     * The SHA256 hash of the deployment package you want to publish. This
     * provides validation on the code you are publishing. If you provide
     * this parameter value must match the SHA256 of the $LATEST version for
     * the publication to succeed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param codeSha256 The SHA256 hash of the deployment package you want to publish. This
     *         provides validation on the code you are publishing. If you provide
     *         this parameter value must match the SHA256 of the $LATEST version for
     *         the publication to succeed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PublishVersionRequest withCodeSha256(String codeSha256) {
        this.codeSha256 = codeSha256;
        return this;
    }

    /**
     * The description for the version you are publishing. If not provided,
     * AWS Lambda copies the description from the $LATEST version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return The description for the version you are publishing. If not provided,
     *         AWS Lambda copies the description from the $LATEST version.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description for the version you are publishing. If not provided,
     * AWS Lambda copies the description from the $LATEST version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param description The description for the version you are publishing. If not provided,
     *         AWS Lambda copies the description from the $LATEST version.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description for the version you are publishing. If not provided,
     * AWS Lambda copies the description from the $LATEST version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param description The description for the version you are publishing. If not provided,
     *         AWS Lambda copies the description from the $LATEST version.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PublishVersionRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFunctionName() != null) sb.append("FunctionName: " + getFunctionName() + ",");
        if (getCodeSha256() != null) sb.append("CodeSha256: " + getCodeSha256() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PublishVersionRequest == false) return false;
        PublishVersionRequest other = (PublishVersionRequest)obj;
        
        if (other.getFunctionName() == null ^ this.getFunctionName() == null) return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false) return false; 
        if (other.getCodeSha256() == null ^ this.getCodeSha256() == null) return false;
        if (other.getCodeSha256() != null && other.getCodeSha256().equals(this.getCodeSha256()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        return true;
    }
    
    @Override
    public PublishVersionRequest clone() {
        
            return (PublishVersionRequest) super.clone();
    }

}
    