/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model;

/**
 * <p>
 * The output for GetTemplate action.
 * </p>
 */
public class GetTemplateResult {

    /**
     * Structure containing the template body. (For more information, go to
     * the <a
     * /docs.amazonwebservices.com/AmazonCloudFormation/latest/CFNGuide/">AWS
     * CloudFormation User Guide</a>.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String templateBody;

    /**
     * Structure containing the template body. (For more information, go to
     * the <a
     * /docs.amazonwebservices.com/AmazonCloudFormation/latest/CFNGuide/">AWS
     * CloudFormation User Guide</a>.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return Structure containing the template body. (For more information, go to
     *         the <a
     *         /docs.amazonwebservices.com/AmazonCloudFormation/latest/CFNGuide/">AWS
     *         CloudFormation User Guide</a>.)
     */
    public String getTemplateBody() {
        return templateBody;
    }
    
    /**
     * Structure containing the template body. (For more information, go to
     * the <a
     * /docs.amazonwebservices.com/AmazonCloudFormation/latest/CFNGuide/">AWS
     * CloudFormation User Guide</a>.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param templateBody Structure containing the template body. (For more information, go to
     *         the <a
     *         /docs.amazonwebservices.com/AmazonCloudFormation/latest/CFNGuide/">AWS
     *         CloudFormation User Guide</a>.)
     */
    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }
    
    /**
     * Structure containing the template body. (For more information, go to
     * the <a
     * /docs.amazonwebservices.com/AmazonCloudFormation/latest/CFNGuide/">AWS
     * CloudFormation User Guide</a>.)
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param templateBody Structure containing the template body. (For more information, go to
     *         the <a
     *         /docs.amazonwebservices.com/AmazonCloudFormation/latest/CFNGuide/">AWS
     *         CloudFormation User Guide</a>.)
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetTemplateResult withTemplateBody(String templateBody) {
        this.templateBody = templateBody;
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
        sb.append("TemplateBody: " + templateBody + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    