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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StopTrainingDocumentClassifier"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopTrainingDocumentClassifierRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the document classifier currently being trained.
     * </p>
     */
    private String documentClassifierArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the document classifier currently being trained.
     * </p>
     * 
     * @param documentClassifierArn
     *        The Amazon Resource Name (ARN) that identifies the document classifier currently being trained.
     */

    public void setDocumentClassifierArn(String documentClassifierArn) {
        this.documentClassifierArn = documentClassifierArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the document classifier currently being trained.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies the document classifier currently being trained.
     */

    public String getDocumentClassifierArn() {
        return this.documentClassifierArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the document classifier currently being trained.
     * </p>
     * 
     * @param documentClassifierArn
     *        The Amazon Resource Name (ARN) that identifies the document classifier currently being trained.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopTrainingDocumentClassifierRequest withDocumentClassifierArn(String documentClassifierArn) {
        setDocumentClassifierArn(documentClassifierArn);
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
        if (getDocumentClassifierArn() != null)
            sb.append("DocumentClassifierArn: ").append(getDocumentClassifierArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopTrainingDocumentClassifierRequest == false)
            return false;
        StopTrainingDocumentClassifierRequest other = (StopTrainingDocumentClassifierRequest) obj;
        if (other.getDocumentClassifierArn() == null ^ this.getDocumentClassifierArn() == null)
            return false;
        if (other.getDocumentClassifierArn() != null && other.getDocumentClassifierArn().equals(this.getDocumentClassifierArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentClassifierArn() == null) ? 0 : getDocumentClassifierArn().hashCode());
        return hashCode;
    }

    @Override
    public StopTrainingDocumentClassifierRequest clone() {
        return (StopTrainingDocumentClassifierRequest) super.clone();
    }

}
