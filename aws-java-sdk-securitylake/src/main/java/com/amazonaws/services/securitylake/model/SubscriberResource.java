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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about the Amazon Security Lake account subscription. Subscribers are notified of new objects for a
 * source as the data is written to your Amazon S3 bucket for Security Lake.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/SubscriberResource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubscriberResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * You can choose to notify subscribers of new objects with an Amazon Simple Queue Service (Amazon SQS) queue or
     * through messaging to an HTTPS endpoint provided by the subscriber.
     * </p>
     * <p>
     * Subscribers can consume data by directly querying Lake Formation tables in your Amazon S3 bucket through services
     * like Amazon Athena. This subscription type is defined as <code>LAKEFORMATION</code>.
     * </p>
     */
    private java.util.List<String> accessTypes;
    /**
     * <p>
     * The Amazon Web Services account ID you are using to create your Amazon Security Lake account.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The date and time when the subscription was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The external ID of the subscriber. The external ID lets the user that is assuming the role assert the
     * circumstances in which they are operating. It also provides a way for the account owner to permit the role to be
     * assumed only under specific circumstances.
     * </p>
     */
    private String externalId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the role of the subscriber.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The ARN for the Amazon S3 bucket.
     * </p>
     */
    private String s3BucketArn;
    /**
     * <p>
     * The ARN for the Amazon Simple Notification Service.
     * </p>
     */
    private String snsArn;
    /**
     * <p>
     * Amazon Security Lake supports log and event collection for natively supported Amazon Web Services. For more
     * information, see the Amazon Security Lake User Guide.
     * </p>
     */
    private java.util.List<SourceType> sourceTypes;
    /**
     * <p>
     * The subscriber descriptions for a subscriber account. The description for a subscriber includes
     * <code>subscriberName</code>, <code>accountID</code>, <code>externalID</code>, and <code>subscriptionId</code>.
     * </p>
     */
    private String subscriberDescription;
    /**
     * <p>
     * The name of your Amazon Security Lake subscriber account.
     * </p>
     */
    private String subscriberName;
    /**
     * <p>
     * The subscription endpoint to which exception messages are posted.
     * </p>
     */
    private String subscriptionEndpoint;
    /**
     * <p>
     * The subscription ID of the Amazon Security Lake subscriber account.
     * </p>
     */
    private String subscriptionId;
    /**
     * <p>
     * The subscription protocol to which exception messages are posted.
     * </p>
     */
    private String subscriptionProtocol;
    /**
     * <p>
     * The subscription status of the Amazon Security Lake subscriber account.
     * </p>
     */
    private String subscriptionStatus;
    /**
     * <p>
     * The date and time when the subscription was created.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * You can choose to notify subscribers of new objects with an Amazon Simple Queue Service (Amazon SQS) queue or
     * through messaging to an HTTPS endpoint provided by the subscriber.
     * </p>
     * <p>
     * Subscribers can consume data by directly querying Lake Formation tables in your Amazon S3 bucket through services
     * like Amazon Athena. This subscription type is defined as <code>LAKEFORMATION</code>.
     * </p>
     * 
     * @return You can choose to notify subscribers of new objects with an Amazon Simple Queue Service (Amazon SQS)
     *         queue or through messaging to an HTTPS endpoint provided by the subscriber. </p>
     *         <p>
     *         Subscribers can consume data by directly querying Lake Formation tables in your Amazon S3 bucket through
     *         services like Amazon Athena. This subscription type is defined as <code>LAKEFORMATION</code>.
     * @see AccessType
     */

    public java.util.List<String> getAccessTypes() {
        return accessTypes;
    }

    /**
     * <p>
     * You can choose to notify subscribers of new objects with an Amazon Simple Queue Service (Amazon SQS) queue or
     * through messaging to an HTTPS endpoint provided by the subscriber.
     * </p>
     * <p>
     * Subscribers can consume data by directly querying Lake Formation tables in your Amazon S3 bucket through services
     * like Amazon Athena. This subscription type is defined as <code>LAKEFORMATION</code>.
     * </p>
     * 
     * @param accessTypes
     *        You can choose to notify subscribers of new objects with an Amazon Simple Queue Service (Amazon SQS) queue
     *        or through messaging to an HTTPS endpoint provided by the subscriber. </p>
     *        <p>
     *        Subscribers can consume data by directly querying Lake Formation tables in your Amazon S3 bucket through
     *        services like Amazon Athena. This subscription type is defined as <code>LAKEFORMATION</code>.
     * @see AccessType
     */

    public void setAccessTypes(java.util.Collection<String> accessTypes) {
        if (accessTypes == null) {
            this.accessTypes = null;
            return;
        }

        this.accessTypes = new java.util.ArrayList<String>(accessTypes);
    }

    /**
     * <p>
     * You can choose to notify subscribers of new objects with an Amazon Simple Queue Service (Amazon SQS) queue or
     * through messaging to an HTTPS endpoint provided by the subscriber.
     * </p>
     * <p>
     * Subscribers can consume data by directly querying Lake Formation tables in your Amazon S3 bucket through services
     * like Amazon Athena. This subscription type is defined as <code>LAKEFORMATION</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccessTypes(java.util.Collection)} or {@link #withAccessTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accessTypes
     *        You can choose to notify subscribers of new objects with an Amazon Simple Queue Service (Amazon SQS) queue
     *        or through messaging to an HTTPS endpoint provided by the subscriber. </p>
     *        <p>
     *        Subscribers can consume data by directly querying Lake Formation tables in your Amazon S3 bucket through
     *        services like Amazon Athena. This subscription type is defined as <code>LAKEFORMATION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessType
     */

    public SubscriberResource withAccessTypes(String... accessTypes) {
        if (this.accessTypes == null) {
            setAccessTypes(new java.util.ArrayList<String>(accessTypes.length));
        }
        for (String ele : accessTypes) {
            this.accessTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * You can choose to notify subscribers of new objects with an Amazon Simple Queue Service (Amazon SQS) queue or
     * through messaging to an HTTPS endpoint provided by the subscriber.
     * </p>
     * <p>
     * Subscribers can consume data by directly querying Lake Formation tables in your Amazon S3 bucket through services
     * like Amazon Athena. This subscription type is defined as <code>LAKEFORMATION</code>.
     * </p>
     * 
     * @param accessTypes
     *        You can choose to notify subscribers of new objects with an Amazon Simple Queue Service (Amazon SQS) queue
     *        or through messaging to an HTTPS endpoint provided by the subscriber. </p>
     *        <p>
     *        Subscribers can consume data by directly querying Lake Formation tables in your Amazon S3 bucket through
     *        services like Amazon Athena. This subscription type is defined as <code>LAKEFORMATION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessType
     */

    public SubscriberResource withAccessTypes(java.util.Collection<String> accessTypes) {
        setAccessTypes(accessTypes);
        return this;
    }

    /**
     * <p>
     * You can choose to notify subscribers of new objects with an Amazon Simple Queue Service (Amazon SQS) queue or
     * through messaging to an HTTPS endpoint provided by the subscriber.
     * </p>
     * <p>
     * Subscribers can consume data by directly querying Lake Formation tables in your Amazon S3 bucket through services
     * like Amazon Athena. This subscription type is defined as <code>LAKEFORMATION</code>.
     * </p>
     * 
     * @param accessTypes
     *        You can choose to notify subscribers of new objects with an Amazon Simple Queue Service (Amazon SQS) queue
     *        or through messaging to an HTTPS endpoint provided by the subscriber. </p>
     *        <p>
     *        Subscribers can consume data by directly querying Lake Formation tables in your Amazon S3 bucket through
     *        services like Amazon Athena. This subscription type is defined as <code>LAKEFORMATION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessType
     */

    public SubscriberResource withAccessTypes(AccessType... accessTypes) {
        java.util.ArrayList<String> accessTypesCopy = new java.util.ArrayList<String>(accessTypes.length);
        for (AccessType value : accessTypes) {
            accessTypesCopy.add(value.toString());
        }
        if (getAccessTypes() == null) {
            setAccessTypes(accessTypesCopy);
        } else {
            getAccessTypes().addAll(accessTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID you are using to create your Amazon Security Lake account.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID you are using to create your Amazon Security Lake account.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID you are using to create your Amazon Security Lake account.
     * </p>
     * 
     * @return The Amazon Web Services account ID you are using to create your Amazon Security Lake account.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID you are using to create your Amazon Security Lake account.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID you are using to create your Amazon Security Lake account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriberResource withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The date and time when the subscription was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the subscription was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time when the subscription was created.
     * </p>
     * 
     * @return The date and time when the subscription was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time when the subscription was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the subscription was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriberResource withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The external ID of the subscriber. The external ID lets the user that is assuming the role assert the
     * circumstances in which they are operating. It also provides a way for the account owner to permit the role to be
     * assumed only under specific circumstances.
     * </p>
     * 
     * @param externalId
     *        The external ID of the subscriber. The external ID lets the user that is assuming the role assert the
     *        circumstances in which they are operating. It also provides a way for the account owner to permit the role
     *        to be assumed only under specific circumstances.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * The external ID of the subscriber. The external ID lets the user that is assuming the role assert the
     * circumstances in which they are operating. It also provides a way for the account owner to permit the role to be
     * assumed only under specific circumstances.
     * </p>
     * 
     * @return The external ID of the subscriber. The external ID lets the user that is assuming the role assert the
     *         circumstances in which they are operating. It also provides a way for the account owner to permit the
     *         role to be assumed only under specific circumstances.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * The external ID of the subscriber. The external ID lets the user that is assuming the role assert the
     * circumstances in which they are operating. It also provides a way for the account owner to permit the role to be
     * assumed only under specific circumstances.
     * </p>
     * 
     * @param externalId
     *        The external ID of the subscriber. The external ID lets the user that is assuming the role assert the
     *        circumstances in which they are operating. It also provides a way for the account owner to permit the role
     *        to be assumed only under specific circumstances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriberResource withExternalId(String externalId) {
        setExternalId(externalId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the role of the subscriber.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) specifying the role of the subscriber.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the role of the subscriber.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) specifying the role of the subscriber.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the role of the subscriber.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) specifying the role of the subscriber.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriberResource withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The ARN for the Amazon S3 bucket.
     * </p>
     * 
     * @param s3BucketArn
     *        The ARN for the Amazon S3 bucket.
     */

    public void setS3BucketArn(String s3BucketArn) {
        this.s3BucketArn = s3BucketArn;
    }

    /**
     * <p>
     * The ARN for the Amazon S3 bucket.
     * </p>
     * 
     * @return The ARN for the Amazon S3 bucket.
     */

    public String getS3BucketArn() {
        return this.s3BucketArn;
    }

    /**
     * <p>
     * The ARN for the Amazon S3 bucket.
     * </p>
     * 
     * @param s3BucketArn
     *        The ARN for the Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriberResource withS3BucketArn(String s3BucketArn) {
        setS3BucketArn(s3BucketArn);
        return this;
    }

    /**
     * <p>
     * The ARN for the Amazon Simple Notification Service.
     * </p>
     * 
     * @param snsArn
     *        The ARN for the Amazon Simple Notification Service.
     */

    public void setSnsArn(String snsArn) {
        this.snsArn = snsArn;
    }

    /**
     * <p>
     * The ARN for the Amazon Simple Notification Service.
     * </p>
     * 
     * @return The ARN for the Amazon Simple Notification Service.
     */

    public String getSnsArn() {
        return this.snsArn;
    }

    /**
     * <p>
     * The ARN for the Amazon Simple Notification Service.
     * </p>
     * 
     * @param snsArn
     *        The ARN for the Amazon Simple Notification Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriberResource withSnsArn(String snsArn) {
        setSnsArn(snsArn);
        return this;
    }

    /**
     * <p>
     * Amazon Security Lake supports log and event collection for natively supported Amazon Web Services. For more
     * information, see the Amazon Security Lake User Guide.
     * </p>
     * 
     * @return Amazon Security Lake supports log and event collection for natively supported Amazon Web Services. For
     *         more information, see the Amazon Security Lake User Guide.
     */

    public java.util.List<SourceType> getSourceTypes() {
        return sourceTypes;
    }

    /**
     * <p>
     * Amazon Security Lake supports log and event collection for natively supported Amazon Web Services. For more
     * information, see the Amazon Security Lake User Guide.
     * </p>
     * 
     * @param sourceTypes
     *        Amazon Security Lake supports log and event collection for natively supported Amazon Web Services. For
     *        more information, see the Amazon Security Lake User Guide.
     */

    public void setSourceTypes(java.util.Collection<SourceType> sourceTypes) {
        if (sourceTypes == null) {
            this.sourceTypes = null;
            return;
        }

        this.sourceTypes = new java.util.ArrayList<SourceType>(sourceTypes);
    }

    /**
     * <p>
     * Amazon Security Lake supports log and event collection for natively supported Amazon Web Services. For more
     * information, see the Amazon Security Lake User Guide.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceTypes(java.util.Collection)} or {@link #withSourceTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sourceTypes
     *        Amazon Security Lake supports log and event collection for natively supported Amazon Web Services. For
     *        more information, see the Amazon Security Lake User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriberResource withSourceTypes(SourceType... sourceTypes) {
        if (this.sourceTypes == null) {
            setSourceTypes(new java.util.ArrayList<SourceType>(sourceTypes.length));
        }
        for (SourceType ele : sourceTypes) {
            this.sourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Amazon Security Lake supports log and event collection for natively supported Amazon Web Services. For more
     * information, see the Amazon Security Lake User Guide.
     * </p>
     * 
     * @param sourceTypes
     *        Amazon Security Lake supports log and event collection for natively supported Amazon Web Services. For
     *        more information, see the Amazon Security Lake User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriberResource withSourceTypes(java.util.Collection<SourceType> sourceTypes) {
        setSourceTypes(sourceTypes);
        return this;
    }

    /**
     * <p>
     * The subscriber descriptions for a subscriber account. The description for a subscriber includes
     * <code>subscriberName</code>, <code>accountID</code>, <code>externalID</code>, and <code>subscriptionId</code>.
     * </p>
     * 
     * @param subscriberDescription
     *        The subscriber descriptions for a subscriber account. The description for a subscriber includes
     *        <code>subscriberName</code>, <code>accountID</code>, <code>externalID</code>, and
     *        <code>subscriptionId</code>.
     */

    public void setSubscriberDescription(String subscriberDescription) {
        this.subscriberDescription = subscriberDescription;
    }

    /**
     * <p>
     * The subscriber descriptions for a subscriber account. The description for a subscriber includes
     * <code>subscriberName</code>, <code>accountID</code>, <code>externalID</code>, and <code>subscriptionId</code>.
     * </p>
     * 
     * @return The subscriber descriptions for a subscriber account. The description for a subscriber includes
     *         <code>subscriberName</code>, <code>accountID</code>, <code>externalID</code>, and
     *         <code>subscriptionId</code>.
     */

    public String getSubscriberDescription() {
        return this.subscriberDescription;
    }

    /**
     * <p>
     * The subscriber descriptions for a subscriber account. The description for a subscriber includes
     * <code>subscriberName</code>, <code>accountID</code>, <code>externalID</code>, and <code>subscriptionId</code>.
     * </p>
     * 
     * @param subscriberDescription
     *        The subscriber descriptions for a subscriber account. The description for a subscriber includes
     *        <code>subscriberName</code>, <code>accountID</code>, <code>externalID</code>, and
     *        <code>subscriptionId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriberResource withSubscriberDescription(String subscriberDescription) {
        setSubscriberDescription(subscriberDescription);
        return this;
    }

    /**
     * <p>
     * The name of your Amazon Security Lake subscriber account.
     * </p>
     * 
     * @param subscriberName
     *        The name of your Amazon Security Lake subscriber account.
     */

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    /**
     * <p>
     * The name of your Amazon Security Lake subscriber account.
     * </p>
     * 
     * @return The name of your Amazon Security Lake subscriber account.
     */

    public String getSubscriberName() {
        return this.subscriberName;
    }

    /**
     * <p>
     * The name of your Amazon Security Lake subscriber account.
     * </p>
     * 
     * @param subscriberName
     *        The name of your Amazon Security Lake subscriber account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriberResource withSubscriberName(String subscriberName) {
        setSubscriberName(subscriberName);
        return this;
    }

    /**
     * <p>
     * The subscription endpoint to which exception messages are posted.
     * </p>
     * 
     * @param subscriptionEndpoint
     *        The subscription endpoint to which exception messages are posted.
     */

    public void setSubscriptionEndpoint(String subscriptionEndpoint) {
        this.subscriptionEndpoint = subscriptionEndpoint;
    }

    /**
     * <p>
     * The subscription endpoint to which exception messages are posted.
     * </p>
     * 
     * @return The subscription endpoint to which exception messages are posted.
     */

    public String getSubscriptionEndpoint() {
        return this.subscriptionEndpoint;
    }

    /**
     * <p>
     * The subscription endpoint to which exception messages are posted.
     * </p>
     * 
     * @param subscriptionEndpoint
     *        The subscription endpoint to which exception messages are posted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriberResource withSubscriptionEndpoint(String subscriptionEndpoint) {
        setSubscriptionEndpoint(subscriptionEndpoint);
        return this;
    }

    /**
     * <p>
     * The subscription ID of the Amazon Security Lake subscriber account.
     * </p>
     * 
     * @param subscriptionId
     *        The subscription ID of the Amazon Security Lake subscriber account.
     */

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * <p>
     * The subscription ID of the Amazon Security Lake subscriber account.
     * </p>
     * 
     * @return The subscription ID of the Amazon Security Lake subscriber account.
     */

    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * <p>
     * The subscription ID of the Amazon Security Lake subscriber account.
     * </p>
     * 
     * @param subscriptionId
     *        The subscription ID of the Amazon Security Lake subscriber account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriberResource withSubscriptionId(String subscriptionId) {
        setSubscriptionId(subscriptionId);
        return this;
    }

    /**
     * <p>
     * The subscription protocol to which exception messages are posted.
     * </p>
     * 
     * @param subscriptionProtocol
     *        The subscription protocol to which exception messages are posted.
     * @see EndpointProtocol
     */

    public void setSubscriptionProtocol(String subscriptionProtocol) {
        this.subscriptionProtocol = subscriptionProtocol;
    }

    /**
     * <p>
     * The subscription protocol to which exception messages are posted.
     * </p>
     * 
     * @return The subscription protocol to which exception messages are posted.
     * @see EndpointProtocol
     */

    public String getSubscriptionProtocol() {
        return this.subscriptionProtocol;
    }

    /**
     * <p>
     * The subscription protocol to which exception messages are posted.
     * </p>
     * 
     * @param subscriptionProtocol
     *        The subscription protocol to which exception messages are posted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointProtocol
     */

    public SubscriberResource withSubscriptionProtocol(String subscriptionProtocol) {
        setSubscriptionProtocol(subscriptionProtocol);
        return this;
    }

    /**
     * <p>
     * The subscription protocol to which exception messages are posted.
     * </p>
     * 
     * @param subscriptionProtocol
     *        The subscription protocol to which exception messages are posted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointProtocol
     */

    public SubscriberResource withSubscriptionProtocol(EndpointProtocol subscriptionProtocol) {
        this.subscriptionProtocol = subscriptionProtocol.toString();
        return this;
    }

    /**
     * <p>
     * The subscription status of the Amazon Security Lake subscriber account.
     * </p>
     * 
     * @param subscriptionStatus
     *        The subscription status of the Amazon Security Lake subscriber account.
     * @see SubscriptionStatus
     */

    public void setSubscriptionStatus(String subscriptionStatus) {
        this.subscriptionStatus = subscriptionStatus;
    }

    /**
     * <p>
     * The subscription status of the Amazon Security Lake subscriber account.
     * </p>
     * 
     * @return The subscription status of the Amazon Security Lake subscriber account.
     * @see SubscriptionStatus
     */

    public String getSubscriptionStatus() {
        return this.subscriptionStatus;
    }

    /**
     * <p>
     * The subscription status of the Amazon Security Lake subscriber account.
     * </p>
     * 
     * @param subscriptionStatus
     *        The subscription status of the Amazon Security Lake subscriber account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionStatus
     */

    public SubscriberResource withSubscriptionStatus(String subscriptionStatus) {
        setSubscriptionStatus(subscriptionStatus);
        return this;
    }

    /**
     * <p>
     * The subscription status of the Amazon Security Lake subscriber account.
     * </p>
     * 
     * @param subscriptionStatus
     *        The subscription status of the Amazon Security Lake subscriber account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionStatus
     */

    public SubscriberResource withSubscriptionStatus(SubscriptionStatus subscriptionStatus) {
        this.subscriptionStatus = subscriptionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the subscription was created.
     * </p>
     * 
     * @param updatedAt
     *        The date and time when the subscription was created.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time when the subscription was created.
     * </p>
     * 
     * @return The date and time when the subscription was created.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time when the subscription was created.
     * </p>
     * 
     * @param updatedAt
     *        The date and time when the subscription was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscriberResource withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getAccessTypes() != null)
            sb.append("AccessTypes: ").append(getAccessTypes()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getExternalId() != null)
            sb.append("ExternalId: ").append(getExternalId()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getS3BucketArn() != null)
            sb.append("S3BucketArn: ").append(getS3BucketArn()).append(",");
        if (getSnsArn() != null)
            sb.append("SnsArn: ").append(getSnsArn()).append(",");
        if (getSourceTypes() != null)
            sb.append("SourceTypes: ").append(getSourceTypes()).append(",");
        if (getSubscriberDescription() != null)
            sb.append("SubscriberDescription: ").append(getSubscriberDescription()).append(",");
        if (getSubscriberName() != null)
            sb.append("SubscriberName: ").append(getSubscriberName()).append(",");
        if (getSubscriptionEndpoint() != null)
            sb.append("SubscriptionEndpoint: ").append(getSubscriptionEndpoint()).append(",");
        if (getSubscriptionId() != null)
            sb.append("SubscriptionId: ").append(getSubscriptionId()).append(",");
        if (getSubscriptionProtocol() != null)
            sb.append("SubscriptionProtocol: ").append(getSubscriptionProtocol()).append(",");
        if (getSubscriptionStatus() != null)
            sb.append("SubscriptionStatus: ").append(getSubscriptionStatus()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubscriberResource == false)
            return false;
        SubscriberResource other = (SubscriberResource) obj;
        if (other.getAccessTypes() == null ^ this.getAccessTypes() == null)
            return false;
        if (other.getAccessTypes() != null && other.getAccessTypes().equals(this.getAccessTypes()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getS3BucketArn() == null ^ this.getS3BucketArn() == null)
            return false;
        if (other.getS3BucketArn() != null && other.getS3BucketArn().equals(this.getS3BucketArn()) == false)
            return false;
        if (other.getSnsArn() == null ^ this.getSnsArn() == null)
            return false;
        if (other.getSnsArn() != null && other.getSnsArn().equals(this.getSnsArn()) == false)
            return false;
        if (other.getSourceTypes() == null ^ this.getSourceTypes() == null)
            return false;
        if (other.getSourceTypes() != null && other.getSourceTypes().equals(this.getSourceTypes()) == false)
            return false;
        if (other.getSubscriberDescription() == null ^ this.getSubscriberDescription() == null)
            return false;
        if (other.getSubscriberDescription() != null && other.getSubscriberDescription().equals(this.getSubscriberDescription()) == false)
            return false;
        if (other.getSubscriberName() == null ^ this.getSubscriberName() == null)
            return false;
        if (other.getSubscriberName() != null && other.getSubscriberName().equals(this.getSubscriberName()) == false)
            return false;
        if (other.getSubscriptionEndpoint() == null ^ this.getSubscriptionEndpoint() == null)
            return false;
        if (other.getSubscriptionEndpoint() != null && other.getSubscriptionEndpoint().equals(this.getSubscriptionEndpoint()) == false)
            return false;
        if (other.getSubscriptionId() == null ^ this.getSubscriptionId() == null)
            return false;
        if (other.getSubscriptionId() != null && other.getSubscriptionId().equals(this.getSubscriptionId()) == false)
            return false;
        if (other.getSubscriptionProtocol() == null ^ this.getSubscriptionProtocol() == null)
            return false;
        if (other.getSubscriptionProtocol() != null && other.getSubscriptionProtocol().equals(this.getSubscriptionProtocol()) == false)
            return false;
        if (other.getSubscriptionStatus() == null ^ this.getSubscriptionStatus() == null)
            return false;
        if (other.getSubscriptionStatus() != null && other.getSubscriptionStatus().equals(this.getSubscriptionStatus()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessTypes() == null) ? 0 : getAccessTypes().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getS3BucketArn() == null) ? 0 : getS3BucketArn().hashCode());
        hashCode = prime * hashCode + ((getSnsArn() == null) ? 0 : getSnsArn().hashCode());
        hashCode = prime * hashCode + ((getSourceTypes() == null) ? 0 : getSourceTypes().hashCode());
        hashCode = prime * hashCode + ((getSubscriberDescription() == null) ? 0 : getSubscriberDescription().hashCode());
        hashCode = prime * hashCode + ((getSubscriberName() == null) ? 0 : getSubscriberName().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionEndpoint() == null) ? 0 : getSubscriptionEndpoint().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionId() == null) ? 0 : getSubscriptionId().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionProtocol() == null) ? 0 : getSubscriptionProtocol().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionStatus() == null) ? 0 : getSubscriptionStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public SubscriberResource clone() {
        try {
            return (SubscriberResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securitylake.model.transform.SubscriberResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
