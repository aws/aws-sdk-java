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
 * Container for the parameters to the {@link com.amazonaws.services.lambda.AWSLambda#getPolicy(GetPolicyRequest) GetPolicy operation}.
 * <p>
 * Returns the resource policy associated with the specified Lambda
 * function.
 * </p>
 * <p>
 * If you are using the versioning feature, you can get the resource
 * policy associated with the specific Lambda function version or alias
 * by specifying the version or alias name using the
 * <code>Qualifier</code> parameter. For more information about
 * versioning, see
 * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"> AWS Lambda Function Versioning and Aliases </a>
 * .
 * </p>
 * <p>
 * For information about adding permissions, see AddPermission.
 * </p>
 * <p>
 * You need permission for the <code>lambda:GetPolicy action.</code>
 * </p>
 *
 * @see com.amazonaws.services.lambda.AWSLambda#getPolicy(GetPolicyRequest)
 */
public class GetPolicyRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * Function name whose resource policy you want to retrieve. <p> You can
     * specify the function name (for example, <code>Thumbnail</code>) or you
     * can specify Amazon Resource Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * If you are using versioning, you can also provide a qualified function
     * ARN (ARN that is qualified with function version or alias name as
     * suffix). AWS Lambda also allows you to specify only the function name
     * with the account ID qualifier (for example,
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
     * You can specify this optional query parameter to specify a function
     * version or an alias name in which case this API will return all
     * permissions associated with the specific qualified ARN. If you don't
     * provide this parameter, the API will return permissions that apply to
     * the unqualified function ARN.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(|[a-zA-Z0-9$_-]+)<br/>
     */
    private String qualifier;

    /**
     * Function name whose resource policy you want to retrieve. <p> You can
     * specify the function name (for example, <code>Thumbnail</code>) or you
     * can specify Amazon Resource Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * If you are using versioning, you can also provide a qualified function
     * ARN (ARN that is qualified with function version or alias name as
     * suffix). AWS Lambda also allows you to specify only the function name
     * with the account ID qualifier (for example,
     * <code>account-id:Thumbnail</code>). Note that the length constraint
     * applies only to the ARN. If you specify only the function name, it is
     * limited to 64 character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @return Function name whose resource policy you want to retrieve. <p> You can
     *         specify the function name (for example, <code>Thumbnail</code>) or you
     *         can specify Amazon Resource Name (ARN) of the function (for example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     *         If you are using versioning, you can also provide a qualified function
     *         ARN (ARN that is qualified with function version or alias name as
     *         suffix). AWS Lambda also allows you to specify only the function name
     *         with the account ID qualifier (for example,
     *         <code>account-id:Thumbnail</code>). Note that the length constraint
     *         applies only to the ARN. If you specify only the function name, it is
     *         limited to 64 character in length.
     */
    public String getFunctionName() {
        return functionName;
    }
    
    /**
     * Function name whose resource policy you want to retrieve. <p> You can
     * specify the function name (for example, <code>Thumbnail</code>) or you
     * can specify Amazon Resource Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * If you are using versioning, you can also provide a qualified function
     * ARN (ARN that is qualified with function version or alias name as
     * suffix). AWS Lambda also allows you to specify only the function name
     * with the account ID qualifier (for example,
     * <code>account-id:Thumbnail</code>). Note that the length constraint
     * applies only to the ARN. If you specify only the function name, it is
     * limited to 64 character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param functionName Function name whose resource policy you want to retrieve. <p> You can
     *         specify the function name (for example, <code>Thumbnail</code>) or you
     *         can specify Amazon Resource Name (ARN) of the function (for example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     *         If you are using versioning, you can also provide a qualified function
     *         ARN (ARN that is qualified with function version or alias name as
     *         suffix). AWS Lambda also allows you to specify only the function name
     *         with the account ID qualifier (for example,
     *         <code>account-id:Thumbnail</code>). Note that the length constraint
     *         applies only to the ARN. If you specify only the function name, it is
     *         limited to 64 character in length.
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
    
    /**
     * Function name whose resource policy you want to retrieve. <p> You can
     * specify the function name (for example, <code>Thumbnail</code>) or you
     * can specify Amazon Resource Name (ARN) of the function (for example,
     * <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     * If you are using versioning, you can also provide a qualified function
     * ARN (ARN that is qualified with function version or alias name as
     * suffix). AWS Lambda also allows you to specify only the function name
     * with the account ID qualifier (for example,
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
     * @param functionName Function name whose resource policy you want to retrieve. <p> You can
     *         specify the function name (for example, <code>Thumbnail</code>) or you
     *         can specify Amazon Resource Name (ARN) of the function (for example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>).
     *         If you are using versioning, you can also provide a qualified function
     *         ARN (ARN that is qualified with function version or alias name as
     *         suffix). AWS Lambda also allows you to specify only the function name
     *         with the account ID qualifier (for example,
     *         <code>account-id:Thumbnail</code>). Note that the length constraint
     *         applies only to the ARN. If you specify only the function name, it is
     *         limited to 64 character in length.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetPolicyRequest withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * You can specify this optional query parameter to specify a function
     * version or an alias name in which case this API will return all
     * permissions associated with the specific qualified ARN. If you don't
     * provide this parameter, the API will return permissions that apply to
     * the unqualified function ARN.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(|[a-zA-Z0-9$_-]+)<br/>
     *
     * @return You can specify this optional query parameter to specify a function
     *         version or an alias name in which case this API will return all
     *         permissions associated with the specific qualified ARN. If you don't
     *         provide this parameter, the API will return permissions that apply to
     *         the unqualified function ARN.
     */
    public String getQualifier() {
        return qualifier;
    }
    
    /**
     * You can specify this optional query parameter to specify a function
     * version or an alias name in which case this API will return all
     * permissions associated with the specific qualified ARN. If you don't
     * provide this parameter, the API will return permissions that apply to
     * the unqualified function ARN.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(|[a-zA-Z0-9$_-]+)<br/>
     *
     * @param qualifier You can specify this optional query parameter to specify a function
     *         version or an alias name in which case this API will return all
     *         permissions associated with the specific qualified ARN. If you don't
     *         provide this parameter, the API will return permissions that apply to
     *         the unqualified function ARN.
     */
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }
    
    /**
     * You can specify this optional query parameter to specify a function
     * version or an alias name in which case this API will return all
     * permissions associated with the specific qualified ARN. If you don't
     * provide this parameter, the API will return permissions that apply to
     * the unqualified function ARN.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(|[a-zA-Z0-9$_-]+)<br/>
     *
     * @param qualifier You can specify this optional query parameter to specify a function
     *         version or an alias name in which case this API will return all
     *         permissions associated with the specific qualified ARN. If you don't
     *         provide this parameter, the API will return permissions that apply to
     *         the unqualified function ARN.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetPolicyRequest withQualifier(String qualifier) {
        this.qualifier = qualifier;
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
        if (getQualifier() != null) sb.append("Qualifier: " + getQualifier() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode()); 
        hashCode = prime * hashCode + ((getQualifier() == null) ? 0 : getQualifier().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetPolicyRequest == false) return false;
        GetPolicyRequest other = (GetPolicyRequest)obj;
        
        if (other.getFunctionName() == null ^ this.getFunctionName() == null) return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false) return false; 
        if (other.getQualifier() == null ^ this.getQualifier() == null) return false;
        if (other.getQualifier() != null && other.getQualifier().equals(this.getQualifier()) == false) return false; 
        return true;
    }
    
    @Override
    public GetPolicyRequest clone() {
        
            return (GetPolicyRequest) super.clone();
    }

}
    