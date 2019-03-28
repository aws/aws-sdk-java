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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CreateConstraint" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConstraintRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     */
    private String acceptLanguage;
    /**
     * <p>
     * The portfolio identifier.
     * </p>
     */
    private String portfolioId;
    /**
     * <p>
     * The product identifier.
     * </p>
     */
    private String productId;
    /**
     * <p>
     * The constraint parameters, in JSON format. The syntax depends on the constraint type as follows:
     * </p>
     * <dl>
     * <dt>LAUNCH</dt>
     * <dd>
     * <p>
     * Specify the <code>RoleArn</code> property as follows:
     * </p>
     * <p>
     * <code>{"RoleArn" : "arn:aws:iam::123456789012:role/LaunchRole"}</code>
     * </p>
     * <p>
     * You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code> constraint.
     * </p>
     * <p>
     * You also cannot have more than one <code>LAUNCH</code> constraint on a product and portfolio.
     * </p>
     * </dd>
     * <dt>NOTIFICATION</dt>
     * <dd>
     * <p>
     * Specify the <code>NotificationArns</code> property as follows:
     * </p>
     * <p>
     * <code>{"NotificationArns" : ["arn:aws:sns:us-east-1:123456789012:Topic"]}</code>
     * </p>
     * </dd>
     * <dt>RESOUCE_UPDATE</dt>
     * <dd>
     * <p>
     * Specify the <code>TagUpdatesOnProvisionedProduct</code> property as follows:
     * </p>
     * <p>
     * <code>{"Version":"2.0","Properties":{"TagUpdateOnProvisionedProduct":"String"}}</code>
     * </p>
     * <p>
     * The <code>TagUpdatesOnProvisionedProduct</code> property accepts a string value of <code>ALLOWED</code> or
     * <code>NOT_ALLOWED</code>.
     * </p>
     * </dd>
     * <dt>STACKSET</dt>
     * <dd>
     * <p>
     * Specify the <code>Parameters</code> property as follows:
     * </p>
     * <p>
     * <code>{"Version": "String", "Properties": {"AccountList": [ "String" ], "RegionList": [ "String" ], "AdminRole": "String", "ExecutionRole": "String"}}</code>
     * </p>
     * <p>
     * You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code> constraint.
     * </p>
     * <p>
     * You also cannot have more than one <code>STACKSET</code> constraint on a product and portfolio.
     * </p>
     * <p>
     * Products with a <code>STACKSET</code> constraint will launch an AWS CloudFormation stack set.
     * </p>
     * </dd>
     * <dt>TEMPLATE</dt>
     * <dd>
     * <p>
     * Specify the <code>Rules</code> property. For more information, see <a
     * href="http://docs.aws.amazon.com/servicecatalog/latest/adminguide/reference-template_constraint_rules.html"
     * >Template Constraint Rules</a>.
     * </p>
     * </dd>
     * </dl>
     */
    private String parameters;
    /**
     * <p>
     * The type of constraint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LAUNCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTIFICATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOURCE_UPDATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STACKSET</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPLATE</code>
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * The description of the constraint.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency
     * token, the same response is returned for each repeated request.
     * </p>
     */
    private String idempotencyToken;

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     */

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @return The language code.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>en</code> - English (default)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>jp</code> - Japanese
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zh</code> - Chinese
     *         </p>
     *         </li>
     */

    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConstraintRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
        return this;
    }

    /**
     * <p>
     * The portfolio identifier.
     * </p>
     * 
     * @param portfolioId
     *        The portfolio identifier.
     */

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    /**
     * <p>
     * The portfolio identifier.
     * </p>
     * 
     * @return The portfolio identifier.
     */

    public String getPortfolioId() {
        return this.portfolioId;
    }

    /**
     * <p>
     * The portfolio identifier.
     * </p>
     * 
     * @param portfolioId
     *        The portfolio identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConstraintRequest withPortfolioId(String portfolioId) {
        setPortfolioId(portfolioId);
        return this;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @param productId
     *        The product identifier.
     */

    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @return The product identifier.
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @param productId
     *        The product identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConstraintRequest withProductId(String productId) {
        setProductId(productId);
        return this;
    }

    /**
     * <p>
     * The constraint parameters, in JSON format. The syntax depends on the constraint type as follows:
     * </p>
     * <dl>
     * <dt>LAUNCH</dt>
     * <dd>
     * <p>
     * Specify the <code>RoleArn</code> property as follows:
     * </p>
     * <p>
     * <code>{"RoleArn" : "arn:aws:iam::123456789012:role/LaunchRole"}</code>
     * </p>
     * <p>
     * You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code> constraint.
     * </p>
     * <p>
     * You also cannot have more than one <code>LAUNCH</code> constraint on a product and portfolio.
     * </p>
     * </dd>
     * <dt>NOTIFICATION</dt>
     * <dd>
     * <p>
     * Specify the <code>NotificationArns</code> property as follows:
     * </p>
     * <p>
     * <code>{"NotificationArns" : ["arn:aws:sns:us-east-1:123456789012:Topic"]}</code>
     * </p>
     * </dd>
     * <dt>RESOUCE_UPDATE</dt>
     * <dd>
     * <p>
     * Specify the <code>TagUpdatesOnProvisionedProduct</code> property as follows:
     * </p>
     * <p>
     * <code>{"Version":"2.0","Properties":{"TagUpdateOnProvisionedProduct":"String"}}</code>
     * </p>
     * <p>
     * The <code>TagUpdatesOnProvisionedProduct</code> property accepts a string value of <code>ALLOWED</code> or
     * <code>NOT_ALLOWED</code>.
     * </p>
     * </dd>
     * <dt>STACKSET</dt>
     * <dd>
     * <p>
     * Specify the <code>Parameters</code> property as follows:
     * </p>
     * <p>
     * <code>{"Version": "String", "Properties": {"AccountList": [ "String" ], "RegionList": [ "String" ], "AdminRole": "String", "ExecutionRole": "String"}}</code>
     * </p>
     * <p>
     * You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code> constraint.
     * </p>
     * <p>
     * You also cannot have more than one <code>STACKSET</code> constraint on a product and portfolio.
     * </p>
     * <p>
     * Products with a <code>STACKSET</code> constraint will launch an AWS CloudFormation stack set.
     * </p>
     * </dd>
     * <dt>TEMPLATE</dt>
     * <dd>
     * <p>
     * Specify the <code>Rules</code> property. For more information, see <a
     * href="http://docs.aws.amazon.com/servicecatalog/latest/adminguide/reference-template_constraint_rules.html"
     * >Template Constraint Rules</a>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param parameters
     *        The constraint parameters, in JSON format. The syntax depends on the constraint type as follows:</p>
     *        <dl>
     *        <dt>LAUNCH</dt>
     *        <dd>
     *        <p>
     *        Specify the <code>RoleArn</code> property as follows:
     *        </p>
     *        <p>
     *        <code>{"RoleArn" : "arn:aws:iam::123456789012:role/LaunchRole"}</code>
     *        </p>
     *        <p>
     *        You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code> constraint.
     *        </p>
     *        <p>
     *        You also cannot have more than one <code>LAUNCH</code> constraint on a product and portfolio.
     *        </p>
     *        </dd>
     *        <dt>NOTIFICATION</dt>
     *        <dd>
     *        <p>
     *        Specify the <code>NotificationArns</code> property as follows:
     *        </p>
     *        <p>
     *        <code>{"NotificationArns" : ["arn:aws:sns:us-east-1:123456789012:Topic"]}</code>
     *        </p>
     *        </dd>
     *        <dt>RESOUCE_UPDATE</dt>
     *        <dd>
     *        <p>
     *        Specify the <code>TagUpdatesOnProvisionedProduct</code> property as follows:
     *        </p>
     *        <p>
     *        <code>{"Version":"2.0","Properties":{"TagUpdateOnProvisionedProduct":"String"}}</code>
     *        </p>
     *        <p>
     *        The <code>TagUpdatesOnProvisionedProduct</code> property accepts a string value of <code>ALLOWED</code> or
     *        <code>NOT_ALLOWED</code>.
     *        </p>
     *        </dd>
     *        <dt>STACKSET</dt>
     *        <dd>
     *        <p>
     *        Specify the <code>Parameters</code> property as follows:
     *        </p>
     *        <p>
     *        <code>{"Version": "String", "Properties": {"AccountList": [ "String" ], "RegionList": [ "String" ], "AdminRole": "String", "ExecutionRole": "String"}}</code>
     *        </p>
     *        <p>
     *        You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code> constraint.
     *        </p>
     *        <p>
     *        You also cannot have more than one <code>STACKSET</code> constraint on a product and portfolio.
     *        </p>
     *        <p>
     *        Products with a <code>STACKSET</code> constraint will launch an AWS CloudFormation stack set.
     *        </p>
     *        </dd>
     *        <dt>TEMPLATE</dt>
     *        <dd>
     *        <p>
     *        Specify the <code>Rules</code> property. For more information, see <a
     *        href="http://docs.aws.amazon.com/servicecatalog/latest/adminguide/reference-template_constraint_rules.html"
     *        >Template Constraint Rules</a>.
     *        </p>
     *        </dd>
     */

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The constraint parameters, in JSON format. The syntax depends on the constraint type as follows:
     * </p>
     * <dl>
     * <dt>LAUNCH</dt>
     * <dd>
     * <p>
     * Specify the <code>RoleArn</code> property as follows:
     * </p>
     * <p>
     * <code>{"RoleArn" : "arn:aws:iam::123456789012:role/LaunchRole"}</code>
     * </p>
     * <p>
     * You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code> constraint.
     * </p>
     * <p>
     * You also cannot have more than one <code>LAUNCH</code> constraint on a product and portfolio.
     * </p>
     * </dd>
     * <dt>NOTIFICATION</dt>
     * <dd>
     * <p>
     * Specify the <code>NotificationArns</code> property as follows:
     * </p>
     * <p>
     * <code>{"NotificationArns" : ["arn:aws:sns:us-east-1:123456789012:Topic"]}</code>
     * </p>
     * </dd>
     * <dt>RESOUCE_UPDATE</dt>
     * <dd>
     * <p>
     * Specify the <code>TagUpdatesOnProvisionedProduct</code> property as follows:
     * </p>
     * <p>
     * <code>{"Version":"2.0","Properties":{"TagUpdateOnProvisionedProduct":"String"}}</code>
     * </p>
     * <p>
     * The <code>TagUpdatesOnProvisionedProduct</code> property accepts a string value of <code>ALLOWED</code> or
     * <code>NOT_ALLOWED</code>.
     * </p>
     * </dd>
     * <dt>STACKSET</dt>
     * <dd>
     * <p>
     * Specify the <code>Parameters</code> property as follows:
     * </p>
     * <p>
     * <code>{"Version": "String", "Properties": {"AccountList": [ "String" ], "RegionList": [ "String" ], "AdminRole": "String", "ExecutionRole": "String"}}</code>
     * </p>
     * <p>
     * You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code> constraint.
     * </p>
     * <p>
     * You also cannot have more than one <code>STACKSET</code> constraint on a product and portfolio.
     * </p>
     * <p>
     * Products with a <code>STACKSET</code> constraint will launch an AWS CloudFormation stack set.
     * </p>
     * </dd>
     * <dt>TEMPLATE</dt>
     * <dd>
     * <p>
     * Specify the <code>Rules</code> property. For more information, see <a
     * href="http://docs.aws.amazon.com/servicecatalog/latest/adminguide/reference-template_constraint_rules.html"
     * >Template Constraint Rules</a>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The constraint parameters, in JSON format. The syntax depends on the constraint type as follows:</p>
     *         <dl>
     *         <dt>LAUNCH</dt>
     *         <dd>
     *         <p>
     *         Specify the <code>RoleArn</code> property as follows:
     *         </p>
     *         <p>
     *         <code>{"RoleArn" : "arn:aws:iam::123456789012:role/LaunchRole"}</code>
     *         </p>
     *         <p>
     *         You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code> constraint.
     *         </p>
     *         <p>
     *         You also cannot have more than one <code>LAUNCH</code> constraint on a product and portfolio.
     *         </p>
     *         </dd>
     *         <dt>NOTIFICATION</dt>
     *         <dd>
     *         <p>
     *         Specify the <code>NotificationArns</code> property as follows:
     *         </p>
     *         <p>
     *         <code>{"NotificationArns" : ["arn:aws:sns:us-east-1:123456789012:Topic"]}</code>
     *         </p>
     *         </dd>
     *         <dt>RESOUCE_UPDATE</dt>
     *         <dd>
     *         <p>
     *         Specify the <code>TagUpdatesOnProvisionedProduct</code> property as follows:
     *         </p>
     *         <p>
     *         <code>{"Version":"2.0","Properties":{"TagUpdateOnProvisionedProduct":"String"}}</code>
     *         </p>
     *         <p>
     *         The <code>TagUpdatesOnProvisionedProduct</code> property accepts a string value of <code>ALLOWED</code>
     *         or <code>NOT_ALLOWED</code>.
     *         </p>
     *         </dd>
     *         <dt>STACKSET</dt>
     *         <dd>
     *         <p>
     *         Specify the <code>Parameters</code> property as follows:
     *         </p>
     *         <p>
     *         <code>{"Version": "String", "Properties": {"AccountList": [ "String" ], "RegionList": [ "String" ], "AdminRole": "String", "ExecutionRole": "String"}}</code>
     *         </p>
     *         <p>
     *         You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code> constraint.
     *         </p>
     *         <p>
     *         You also cannot have more than one <code>STACKSET</code> constraint on a product and portfolio.
     *         </p>
     *         <p>
     *         Products with a <code>STACKSET</code> constraint will launch an AWS CloudFormation stack set.
     *         </p>
     *         </dd>
     *         <dt>TEMPLATE</dt>
     *         <dd>
     *         <p>
     *         Specify the <code>Rules</code> property. For more information, see <a
     *         href="http://docs.aws.amazon.com/servicecatalog/latest/adminguide/reference-template_constraint_rules.html"
     *         >Template Constraint Rules</a>.
     *         </p>
     *         </dd>
     */

    public String getParameters() {
        return this.parameters;
    }

    /**
     * <p>
     * The constraint parameters, in JSON format. The syntax depends on the constraint type as follows:
     * </p>
     * <dl>
     * <dt>LAUNCH</dt>
     * <dd>
     * <p>
     * Specify the <code>RoleArn</code> property as follows:
     * </p>
     * <p>
     * <code>{"RoleArn" : "arn:aws:iam::123456789012:role/LaunchRole"}</code>
     * </p>
     * <p>
     * You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code> constraint.
     * </p>
     * <p>
     * You also cannot have more than one <code>LAUNCH</code> constraint on a product and portfolio.
     * </p>
     * </dd>
     * <dt>NOTIFICATION</dt>
     * <dd>
     * <p>
     * Specify the <code>NotificationArns</code> property as follows:
     * </p>
     * <p>
     * <code>{"NotificationArns" : ["arn:aws:sns:us-east-1:123456789012:Topic"]}</code>
     * </p>
     * </dd>
     * <dt>RESOUCE_UPDATE</dt>
     * <dd>
     * <p>
     * Specify the <code>TagUpdatesOnProvisionedProduct</code> property as follows:
     * </p>
     * <p>
     * <code>{"Version":"2.0","Properties":{"TagUpdateOnProvisionedProduct":"String"}}</code>
     * </p>
     * <p>
     * The <code>TagUpdatesOnProvisionedProduct</code> property accepts a string value of <code>ALLOWED</code> or
     * <code>NOT_ALLOWED</code>.
     * </p>
     * </dd>
     * <dt>STACKSET</dt>
     * <dd>
     * <p>
     * Specify the <code>Parameters</code> property as follows:
     * </p>
     * <p>
     * <code>{"Version": "String", "Properties": {"AccountList": [ "String" ], "RegionList": [ "String" ], "AdminRole": "String", "ExecutionRole": "String"}}</code>
     * </p>
     * <p>
     * You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code> constraint.
     * </p>
     * <p>
     * You also cannot have more than one <code>STACKSET</code> constraint on a product and portfolio.
     * </p>
     * <p>
     * Products with a <code>STACKSET</code> constraint will launch an AWS CloudFormation stack set.
     * </p>
     * </dd>
     * <dt>TEMPLATE</dt>
     * <dd>
     * <p>
     * Specify the <code>Rules</code> property. For more information, see <a
     * href="http://docs.aws.amazon.com/servicecatalog/latest/adminguide/reference-template_constraint_rules.html"
     * >Template Constraint Rules</a>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param parameters
     *        The constraint parameters, in JSON format. The syntax depends on the constraint type as follows:</p>
     *        <dl>
     *        <dt>LAUNCH</dt>
     *        <dd>
     *        <p>
     *        Specify the <code>RoleArn</code> property as follows:
     *        </p>
     *        <p>
     *        <code>{"RoleArn" : "arn:aws:iam::123456789012:role/LaunchRole"}</code>
     *        </p>
     *        <p>
     *        You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code> constraint.
     *        </p>
     *        <p>
     *        You also cannot have more than one <code>LAUNCH</code> constraint on a product and portfolio.
     *        </p>
     *        </dd>
     *        <dt>NOTIFICATION</dt>
     *        <dd>
     *        <p>
     *        Specify the <code>NotificationArns</code> property as follows:
     *        </p>
     *        <p>
     *        <code>{"NotificationArns" : ["arn:aws:sns:us-east-1:123456789012:Topic"]}</code>
     *        </p>
     *        </dd>
     *        <dt>RESOUCE_UPDATE</dt>
     *        <dd>
     *        <p>
     *        Specify the <code>TagUpdatesOnProvisionedProduct</code> property as follows:
     *        </p>
     *        <p>
     *        <code>{"Version":"2.0","Properties":{"TagUpdateOnProvisionedProduct":"String"}}</code>
     *        </p>
     *        <p>
     *        The <code>TagUpdatesOnProvisionedProduct</code> property accepts a string value of <code>ALLOWED</code> or
     *        <code>NOT_ALLOWED</code>.
     *        </p>
     *        </dd>
     *        <dt>STACKSET</dt>
     *        <dd>
     *        <p>
     *        Specify the <code>Parameters</code> property as follows:
     *        </p>
     *        <p>
     *        <code>{"Version": "String", "Properties": {"AccountList": [ "String" ], "RegionList": [ "String" ], "AdminRole": "String", "ExecutionRole": "String"}}</code>
     *        </p>
     *        <p>
     *        You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code> constraint.
     *        </p>
     *        <p>
     *        You also cannot have more than one <code>STACKSET</code> constraint on a product and portfolio.
     *        </p>
     *        <p>
     *        Products with a <code>STACKSET</code> constraint will launch an AWS CloudFormation stack set.
     *        </p>
     *        </dd>
     *        <dt>TEMPLATE</dt>
     *        <dd>
     *        <p>
     *        Specify the <code>Rules</code> property. For more information, see <a
     *        href="http://docs.aws.amazon.com/servicecatalog/latest/adminguide/reference-template_constraint_rules.html"
     *        >Template Constraint Rules</a>.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConstraintRequest withParameters(String parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * The type of constraint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LAUNCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTIFICATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOURCE_UPDATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STACKSET</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPLATE</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of constraint.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LAUNCH</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOTIFICATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESOURCE_UPDATE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STACKSET</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TEMPLATE</code>
     *        </p>
     *        </li>
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of constraint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LAUNCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTIFICATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOURCE_UPDATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STACKSET</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPLATE</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of constraint.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>LAUNCH</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOTIFICATION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RESOURCE_UPDATE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STACKSET</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TEMPLATE</code>
     *         </p>
     *         </li>
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of constraint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LAUNCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTIFICATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOURCE_UPDATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STACKSET</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPLATE</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of constraint.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LAUNCH</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOTIFICATION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESOURCE_UPDATE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STACKSET</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TEMPLATE</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConstraintRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The description of the constraint.
     * </p>
     * 
     * @param description
     *        The description of the constraint.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the constraint.
     * </p>
     * 
     * @return The description of the constraint.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the constraint.
     * </p>
     * 
     * @param description
     *        The description of the constraint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConstraintRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency
     * token, the same response is returned for each repeated request.
     * </p>
     * 
     * @param idempotencyToken
     *        A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the
     *        idempotency token, the same response is returned for each repeated request.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency
     * token, the same response is returned for each repeated request.
     * </p>
     * 
     * @return A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the
     *         idempotency token, the same response is returned for each repeated request.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency
     * token, the same response is returned for each repeated request.
     * </p>
     * 
     * @param idempotencyToken
     *        A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the
     *        idempotency token, the same response is returned for each repeated request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConstraintRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
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
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: ").append(getAcceptLanguage()).append(",");
        if (getPortfolioId() != null)
            sb.append("PortfolioId: ").append(getPortfolioId()).append(",");
        if (getProductId() != null)
            sb.append("ProductId: ").append(getProductId()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConstraintRequest == false)
            return false;
        CreateConstraintRequest other = (CreateConstraintRequest) obj;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getPortfolioId() == null ^ this.getPortfolioId() == null)
            return false;
        if (other.getPortfolioId() != null && other.getPortfolioId().equals(this.getPortfolioId()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getPortfolioId() == null) ? 0 : getPortfolioId().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateConstraintRequest clone() {
        return (CreateConstraintRequest) super.clone();
    }

}
