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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/StartDocumentAnalysis" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartDocumentAnalysisRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The location of the document to be processed.
     * </p>
     */
    private DocumentLocation documentLocation;
    /**
     * <p>
     * A list of the types of analysis to perform. Add TABLES to the list to return information about the tables that
     * are detected in the input document. Add FORMS to return detected fields and the associated text. To perform both
     * types of analysis, add TABLES and FORMS to <code>FeatureTypes</code>. All selectable elements (
     * <code>SELECTION_ELEMENT</code>) that are detected are returned, whatever the value of <code>FeatureTypes</code>.
     * </p>
     */
    private java.util.List<String> featureTypes;
    /**
     * <p>
     * The idempotent token that you use to identify the start request. If you use the same token with multiple
     * <code>StartDocumentAnalysis</code> requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being accidentally started more than once.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * An identifier you specify that's included in the completion notification that's published to the Amazon SNS
     * topic. For example, you can use <code>JobTag</code> to identify the type of document, such as a tax form or a
     * receipt, that the completion notification corresponds to.
     * </p>
     */
    private String jobTag;
    /**
     * <p>
     * The Amazon SNS topic ARN that you want Amazon Textract to publish the completion status of the operation to.
     * </p>
     */
    private NotificationChannel notificationChannel;

    /**
     * <p>
     * The location of the document to be processed.
     * </p>
     * 
     * @param documentLocation
     *        The location of the document to be processed.
     */

    public void setDocumentLocation(DocumentLocation documentLocation) {
        this.documentLocation = documentLocation;
    }

    /**
     * <p>
     * The location of the document to be processed.
     * </p>
     * 
     * @return The location of the document to be processed.
     */

    public DocumentLocation getDocumentLocation() {
        return this.documentLocation;
    }

    /**
     * <p>
     * The location of the document to be processed.
     * </p>
     * 
     * @param documentLocation
     *        The location of the document to be processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDocumentAnalysisRequest withDocumentLocation(DocumentLocation documentLocation) {
        setDocumentLocation(documentLocation);
        return this;
    }

    /**
     * <p>
     * A list of the types of analysis to perform. Add TABLES to the list to return information about the tables that
     * are detected in the input document. Add FORMS to return detected fields and the associated text. To perform both
     * types of analysis, add TABLES and FORMS to <code>FeatureTypes</code>. All selectable elements (
     * <code>SELECTION_ELEMENT</code>) that are detected are returned, whatever the value of <code>FeatureTypes</code>.
     * </p>
     * 
     * @return A list of the types of analysis to perform. Add TABLES to the list to return information about the tables
     *         that are detected in the input document. Add FORMS to return detected fields and the associated text. To
     *         perform both types of analysis, add TABLES and FORMS to <code>FeatureTypes</code>. All selectable
     *         elements (<code>SELECTION_ELEMENT</code>) that are detected are returned, whatever the value of
     *         <code>FeatureTypes</code>.
     * @see FeatureType
     */

    public java.util.List<String> getFeatureTypes() {
        return featureTypes;
    }

    /**
     * <p>
     * A list of the types of analysis to perform. Add TABLES to the list to return information about the tables that
     * are detected in the input document. Add FORMS to return detected fields and the associated text. To perform both
     * types of analysis, add TABLES and FORMS to <code>FeatureTypes</code>. All selectable elements (
     * <code>SELECTION_ELEMENT</code>) that are detected are returned, whatever the value of <code>FeatureTypes</code>.
     * </p>
     * 
     * @param featureTypes
     *        A list of the types of analysis to perform. Add TABLES to the list to return information about the tables
     *        that are detected in the input document. Add FORMS to return detected fields and the associated text. To
     *        perform both types of analysis, add TABLES and FORMS to <code>FeatureTypes</code>. All selectable elements
     *        (<code>SELECTION_ELEMENT</code>) that are detected are returned, whatever the value of
     *        <code>FeatureTypes</code>.
     * @see FeatureType
     */

    public void setFeatureTypes(java.util.Collection<String> featureTypes) {
        if (featureTypes == null) {
            this.featureTypes = null;
            return;
        }

        this.featureTypes = new java.util.ArrayList<String>(featureTypes);
    }

    /**
     * <p>
     * A list of the types of analysis to perform. Add TABLES to the list to return information about the tables that
     * are detected in the input document. Add FORMS to return detected fields and the associated text. To perform both
     * types of analysis, add TABLES and FORMS to <code>FeatureTypes</code>. All selectable elements (
     * <code>SELECTION_ELEMENT</code>) that are detected are returned, whatever the value of <code>FeatureTypes</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeatureTypes(java.util.Collection)} or {@link #withFeatureTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param featureTypes
     *        A list of the types of analysis to perform. Add TABLES to the list to return information about the tables
     *        that are detected in the input document. Add FORMS to return detected fields and the associated text. To
     *        perform both types of analysis, add TABLES and FORMS to <code>FeatureTypes</code>. All selectable elements
     *        (<code>SELECTION_ELEMENT</code>) that are detected are returned, whatever the value of
     *        <code>FeatureTypes</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public StartDocumentAnalysisRequest withFeatureTypes(String... featureTypes) {
        if (this.featureTypes == null) {
            setFeatureTypes(new java.util.ArrayList<String>(featureTypes.length));
        }
        for (String ele : featureTypes) {
            this.featureTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the types of analysis to perform. Add TABLES to the list to return information about the tables that
     * are detected in the input document. Add FORMS to return detected fields and the associated text. To perform both
     * types of analysis, add TABLES and FORMS to <code>FeatureTypes</code>. All selectable elements (
     * <code>SELECTION_ELEMENT</code>) that are detected are returned, whatever the value of <code>FeatureTypes</code>.
     * </p>
     * 
     * @param featureTypes
     *        A list of the types of analysis to perform. Add TABLES to the list to return information about the tables
     *        that are detected in the input document. Add FORMS to return detected fields and the associated text. To
     *        perform both types of analysis, add TABLES and FORMS to <code>FeatureTypes</code>. All selectable elements
     *        (<code>SELECTION_ELEMENT</code>) that are detected are returned, whatever the value of
     *        <code>FeatureTypes</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public StartDocumentAnalysisRequest withFeatureTypes(java.util.Collection<String> featureTypes) {
        setFeatureTypes(featureTypes);
        return this;
    }

    /**
     * <p>
     * A list of the types of analysis to perform. Add TABLES to the list to return information about the tables that
     * are detected in the input document. Add FORMS to return detected fields and the associated text. To perform both
     * types of analysis, add TABLES and FORMS to <code>FeatureTypes</code>. All selectable elements (
     * <code>SELECTION_ELEMENT</code>) that are detected are returned, whatever the value of <code>FeatureTypes</code>.
     * </p>
     * 
     * @param featureTypes
     *        A list of the types of analysis to perform. Add TABLES to the list to return information about the tables
     *        that are detected in the input document. Add FORMS to return detected fields and the associated text. To
     *        perform both types of analysis, add TABLES and FORMS to <code>FeatureTypes</code>. All selectable elements
     *        (<code>SELECTION_ELEMENT</code>) that are detected are returned, whatever the value of
     *        <code>FeatureTypes</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public StartDocumentAnalysisRequest withFeatureTypes(FeatureType... featureTypes) {
        java.util.ArrayList<String> featureTypesCopy = new java.util.ArrayList<String>(featureTypes.length);
        for (FeatureType value : featureTypes) {
            featureTypesCopy.add(value.toString());
        }
        if (getFeatureTypes() == null) {
            setFeatureTypes(featureTypesCopy);
        } else {
            getFeatureTypes().addAll(featureTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The idempotent token that you use to identify the start request. If you use the same token with multiple
     * <code>StartDocumentAnalysis</code> requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being accidentally started more than once.
     * </p>
     * 
     * @param clientRequestToken
     *        The idempotent token that you use to identify the start request. If you use the same token with multiple
     *        <code>StartDocumentAnalysis</code> requests, the same <code>JobId</code> is returned. Use
     *        <code>ClientRequestToken</code> to prevent the same job from being accidentally started more than once.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The idempotent token that you use to identify the start request. If you use the same token with multiple
     * <code>StartDocumentAnalysis</code> requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being accidentally started more than once.
     * </p>
     * 
     * @return The idempotent token that you use to identify the start request. If you use the same token with multiple
     *         <code>StartDocumentAnalysis</code> requests, the same <code>JobId</code> is returned. Use
     *         <code>ClientRequestToken</code> to prevent the same job from being accidentally started more than once.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * The idempotent token that you use to identify the start request. If you use the same token with multiple
     * <code>StartDocumentAnalysis</code> requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being accidentally started more than once.
     * </p>
     * 
     * @param clientRequestToken
     *        The idempotent token that you use to identify the start request. If you use the same token with multiple
     *        <code>StartDocumentAnalysis</code> requests, the same <code>JobId</code> is returned. Use
     *        <code>ClientRequestToken</code> to prevent the same job from being accidentally started more than once.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDocumentAnalysisRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * An identifier you specify that's included in the completion notification that's published to the Amazon SNS
     * topic. For example, you can use <code>JobTag</code> to identify the type of document, such as a tax form or a
     * receipt, that the completion notification corresponds to.
     * </p>
     * 
     * @param jobTag
     *        An identifier you specify that's included in the completion notification that's published to the Amazon
     *        SNS topic. For example, you can use <code>JobTag</code> to identify the type of document, such as a tax
     *        form or a receipt, that the completion notification corresponds to.
     */

    public void setJobTag(String jobTag) {
        this.jobTag = jobTag;
    }

    /**
     * <p>
     * An identifier you specify that's included in the completion notification that's published to the Amazon SNS
     * topic. For example, you can use <code>JobTag</code> to identify the type of document, such as a tax form or a
     * receipt, that the completion notification corresponds to.
     * </p>
     * 
     * @return An identifier you specify that's included in the completion notification that's published to the Amazon
     *         SNS topic. For example, you can use <code>JobTag</code> to identify the type of document, such as a tax
     *         form or a receipt, that the completion notification corresponds to.
     */

    public String getJobTag() {
        return this.jobTag;
    }

    /**
     * <p>
     * An identifier you specify that's included in the completion notification that's published to the Amazon SNS
     * topic. For example, you can use <code>JobTag</code> to identify the type of document, such as a tax form or a
     * receipt, that the completion notification corresponds to.
     * </p>
     * 
     * @param jobTag
     *        An identifier you specify that's included in the completion notification that's published to the Amazon
     *        SNS topic. For example, you can use <code>JobTag</code> to identify the type of document, such as a tax
     *        form or a receipt, that the completion notification corresponds to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDocumentAnalysisRequest withJobTag(String jobTag) {
        setJobTag(jobTag);
        return this;
    }

    /**
     * <p>
     * The Amazon SNS topic ARN that you want Amazon Textract to publish the completion status of the operation to.
     * </p>
     * 
     * @param notificationChannel
     *        The Amazon SNS topic ARN that you want Amazon Textract to publish the completion status of the operation
     *        to.
     */

    public void setNotificationChannel(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    /**
     * <p>
     * The Amazon SNS topic ARN that you want Amazon Textract to publish the completion status of the operation to.
     * </p>
     * 
     * @return The Amazon SNS topic ARN that you want Amazon Textract to publish the completion status of the operation
     *         to.
     */

    public NotificationChannel getNotificationChannel() {
        return this.notificationChannel;
    }

    /**
     * <p>
     * The Amazon SNS topic ARN that you want Amazon Textract to publish the completion status of the operation to.
     * </p>
     * 
     * @param notificationChannel
     *        The Amazon SNS topic ARN that you want Amazon Textract to publish the completion status of the operation
     *        to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDocumentAnalysisRequest withNotificationChannel(NotificationChannel notificationChannel) {
        setNotificationChannel(notificationChannel);
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
        if (getDocumentLocation() != null)
            sb.append("DocumentLocation: ").append(getDocumentLocation()).append(",");
        if (getFeatureTypes() != null)
            sb.append("FeatureTypes: ").append(getFeatureTypes()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getJobTag() != null)
            sb.append("JobTag: ").append(getJobTag()).append(",");
        if (getNotificationChannel() != null)
            sb.append("NotificationChannel: ").append(getNotificationChannel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartDocumentAnalysisRequest == false)
            return false;
        StartDocumentAnalysisRequest other = (StartDocumentAnalysisRequest) obj;
        if (other.getDocumentLocation() == null ^ this.getDocumentLocation() == null)
            return false;
        if (other.getDocumentLocation() != null && other.getDocumentLocation().equals(this.getDocumentLocation()) == false)
            return false;
        if (other.getFeatureTypes() == null ^ this.getFeatureTypes() == null)
            return false;
        if (other.getFeatureTypes() != null && other.getFeatureTypes().equals(this.getFeatureTypes()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getJobTag() == null ^ this.getJobTag() == null)
            return false;
        if (other.getJobTag() != null && other.getJobTag().equals(this.getJobTag()) == false)
            return false;
        if (other.getNotificationChannel() == null ^ this.getNotificationChannel() == null)
            return false;
        if (other.getNotificationChannel() != null && other.getNotificationChannel().equals(this.getNotificationChannel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentLocation() == null) ? 0 : getDocumentLocation().hashCode());
        hashCode = prime * hashCode + ((getFeatureTypes() == null) ? 0 : getFeatureTypes().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getJobTag() == null) ? 0 : getJobTag().hashCode());
        hashCode = prime * hashCode + ((getNotificationChannel() == null) ? 0 : getNotificationChannel().hashCode());
        return hashCode;
    }

    @Override
    public StartDocumentAnalysisRequest clone() {
        return (StartDocumentAnalysisRequest) super.clone();
    }

}
