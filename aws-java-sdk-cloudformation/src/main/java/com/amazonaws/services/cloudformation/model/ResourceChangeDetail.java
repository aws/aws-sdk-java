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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * For a resource with <code>Modify</code> as the action, the <code>ResourceChange</code> structure describes the
 * changes AWS CloudFormation will make to that resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ResourceChangeDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceChangeDetail implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>ResourceTargetDefinition</code> structure that describes the field that AWS CloudFormation will change
     * and whether the resource will be recreated.
     * </p>
     */
    private ResourceTargetDefinition target;
    /**
     * <p>
     * Indicates whether AWS CloudFormation can determine the target value, and whether the target value will change
     * before you execute a change set.
     * </p>
     * <p>
     * For <code>Static</code> evaluations, AWS CloudFormation can determine that the target value will change, and its
     * value. For example, if you directly modify the <code>InstanceType</code> property of an EC2 instance, AWS
     * CloudFormation knows that this property value will change, and its value, so this is a <code>Static</code>
     * evaluation.
     * </p>
     * <p>
     * For <code>Dynamic</code> evaluations, cannot determine the target value because it depends on the result of an
     * intrinsic function, such as a <code>Ref</code> or <code>Fn::GetAtt</code> intrinsic function, when the stack is
     * updated. For example, if your template includes a reference to a resource that is conditionally recreated, the
     * value of the reference (the physical ID of the resource) might change, depending on if the resource is recreated.
     * If the resource is recreated, it will have a new physical ID, so all references to that resource will also be
     * updated.
     * </p>
     */
    private String evaluation;
    /**
     * <p>
     * The group to which the <code>CausingEntity</code> value belongs. There are five entity groups:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ResourceReference</code> entities are <code>Ref</code> intrinsic functions that refer to resources in the
     * template, such as <code>{ "Ref" : "MyEC2InstanceResource" }</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ParameterReference</code> entities are <code>Ref</code> intrinsic functions that get template parameter
     * values, such as <code>{ "Ref" : "MyPasswordParameter" }</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceAttribute</code> entities are <code>Fn::GetAtt</code> intrinsic functions that get resource
     * attribute values, such as <code>{ "Fn::GetAtt" : [ "MyEC2InstanceResource", "PublicDnsName" ] }</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DirectModification</code> entities are changes that are made directly to the template.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Automatic</code> entities are <code>AWS::CloudFormation::Stack</code> resource types, which are also known
     * as nested stacks. If you made no changes to the <code>AWS::CloudFormation::Stack</code> resource, AWS
     * CloudFormation sets the <code>ChangeSource</code> to <code>Automatic</code> because the nested stack's template
     * might have changed. Changes to a nested stack's template aren't visible to AWS CloudFormation until you run an
     * update on the parent stack.
     * </p>
     * </li>
     * </ul>
     */
    private String changeSource;
    /**
     * <p>
     * The identity of the entity that triggered this change. This entity is a member of the group that is specified by
     * the <code>ChangeSource</code> field. For example, if you modified the value of the <code>KeyPairName</code>
     * parameter, the <code>CausingEntity</code> is the name of the parameter (<code>KeyPairName</code>).
     * </p>
     * <p>
     * If the <code>ChangeSource</code> value is <code>DirectModification</code>, no value is given for
     * <code>CausingEntity</code>.
     * </p>
     */
    private String causingEntity;

    /**
     * <p>
     * A <code>ResourceTargetDefinition</code> structure that describes the field that AWS CloudFormation will change
     * and whether the resource will be recreated.
     * </p>
     * 
     * @param target
     *        A <code>ResourceTargetDefinition</code> structure that describes the field that AWS CloudFormation will
     *        change and whether the resource will be recreated.
     */

    public void setTarget(ResourceTargetDefinition target) {
        this.target = target;
    }

    /**
     * <p>
     * A <code>ResourceTargetDefinition</code> structure that describes the field that AWS CloudFormation will change
     * and whether the resource will be recreated.
     * </p>
     * 
     * @return A <code>ResourceTargetDefinition</code> structure that describes the field that AWS CloudFormation will
     *         change and whether the resource will be recreated.
     */

    public ResourceTargetDefinition getTarget() {
        return this.target;
    }

    /**
     * <p>
     * A <code>ResourceTargetDefinition</code> structure that describes the field that AWS CloudFormation will change
     * and whether the resource will be recreated.
     * </p>
     * 
     * @param target
     *        A <code>ResourceTargetDefinition</code> structure that describes the field that AWS CloudFormation will
     *        change and whether the resource will be recreated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceChangeDetail withTarget(ResourceTargetDefinition target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * Indicates whether AWS CloudFormation can determine the target value, and whether the target value will change
     * before you execute a change set.
     * </p>
     * <p>
     * For <code>Static</code> evaluations, AWS CloudFormation can determine that the target value will change, and its
     * value. For example, if you directly modify the <code>InstanceType</code> property of an EC2 instance, AWS
     * CloudFormation knows that this property value will change, and its value, so this is a <code>Static</code>
     * evaluation.
     * </p>
     * <p>
     * For <code>Dynamic</code> evaluations, cannot determine the target value because it depends on the result of an
     * intrinsic function, such as a <code>Ref</code> or <code>Fn::GetAtt</code> intrinsic function, when the stack is
     * updated. For example, if your template includes a reference to a resource that is conditionally recreated, the
     * value of the reference (the physical ID of the resource) might change, depending on if the resource is recreated.
     * If the resource is recreated, it will have a new physical ID, so all references to that resource will also be
     * updated.
     * </p>
     * 
     * @param evaluation
     *        Indicates whether AWS CloudFormation can determine the target value, and whether the target value will
     *        change before you execute a change set.</p>
     *        <p>
     *        For <code>Static</code> evaluations, AWS CloudFormation can determine that the target value will change,
     *        and its value. For example, if you directly modify the <code>InstanceType</code> property of an EC2
     *        instance, AWS CloudFormation knows that this property value will change, and its value, so this is a
     *        <code>Static</code> evaluation.
     *        </p>
     *        <p>
     *        For <code>Dynamic</code> evaluations, cannot determine the target value because it depends on the result
     *        of an intrinsic function, such as a <code>Ref</code> or <code>Fn::GetAtt</code> intrinsic function, when
     *        the stack is updated. For example, if your template includes a reference to a resource that is
     *        conditionally recreated, the value of the reference (the physical ID of the resource) might change,
     *        depending on if the resource is recreated. If the resource is recreated, it will have a new physical ID,
     *        so all references to that resource will also be updated.
     * @see EvaluationType
     */

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    /**
     * <p>
     * Indicates whether AWS CloudFormation can determine the target value, and whether the target value will change
     * before you execute a change set.
     * </p>
     * <p>
     * For <code>Static</code> evaluations, AWS CloudFormation can determine that the target value will change, and its
     * value. For example, if you directly modify the <code>InstanceType</code> property of an EC2 instance, AWS
     * CloudFormation knows that this property value will change, and its value, so this is a <code>Static</code>
     * evaluation.
     * </p>
     * <p>
     * For <code>Dynamic</code> evaluations, cannot determine the target value because it depends on the result of an
     * intrinsic function, such as a <code>Ref</code> or <code>Fn::GetAtt</code> intrinsic function, when the stack is
     * updated. For example, if your template includes a reference to a resource that is conditionally recreated, the
     * value of the reference (the physical ID of the resource) might change, depending on if the resource is recreated.
     * If the resource is recreated, it will have a new physical ID, so all references to that resource will also be
     * updated.
     * </p>
     * 
     * @return Indicates whether AWS CloudFormation can determine the target value, and whether the target value will
     *         change before you execute a change set.</p>
     *         <p>
     *         For <code>Static</code> evaluations, AWS CloudFormation can determine that the target value will change,
     *         and its value. For example, if you directly modify the <code>InstanceType</code> property of an EC2
     *         instance, AWS CloudFormation knows that this property value will change, and its value, so this is a
     *         <code>Static</code> evaluation.
     *         </p>
     *         <p>
     *         For <code>Dynamic</code> evaluations, cannot determine the target value because it depends on the result
     *         of an intrinsic function, such as a <code>Ref</code> or <code>Fn::GetAtt</code> intrinsic function, when
     *         the stack is updated. For example, if your template includes a reference to a resource that is
     *         conditionally recreated, the value of the reference (the physical ID of the resource) might change,
     *         depending on if the resource is recreated. If the resource is recreated, it will have a new physical ID,
     *         so all references to that resource will also be updated.
     * @see EvaluationType
     */

    public String getEvaluation() {
        return this.evaluation;
    }

    /**
     * <p>
     * Indicates whether AWS CloudFormation can determine the target value, and whether the target value will change
     * before you execute a change set.
     * </p>
     * <p>
     * For <code>Static</code> evaluations, AWS CloudFormation can determine that the target value will change, and its
     * value. For example, if you directly modify the <code>InstanceType</code> property of an EC2 instance, AWS
     * CloudFormation knows that this property value will change, and its value, so this is a <code>Static</code>
     * evaluation.
     * </p>
     * <p>
     * For <code>Dynamic</code> evaluations, cannot determine the target value because it depends on the result of an
     * intrinsic function, such as a <code>Ref</code> or <code>Fn::GetAtt</code> intrinsic function, when the stack is
     * updated. For example, if your template includes a reference to a resource that is conditionally recreated, the
     * value of the reference (the physical ID of the resource) might change, depending on if the resource is recreated.
     * If the resource is recreated, it will have a new physical ID, so all references to that resource will also be
     * updated.
     * </p>
     * 
     * @param evaluation
     *        Indicates whether AWS CloudFormation can determine the target value, and whether the target value will
     *        change before you execute a change set.</p>
     *        <p>
     *        For <code>Static</code> evaluations, AWS CloudFormation can determine that the target value will change,
     *        and its value. For example, if you directly modify the <code>InstanceType</code> property of an EC2
     *        instance, AWS CloudFormation knows that this property value will change, and its value, so this is a
     *        <code>Static</code> evaluation.
     *        </p>
     *        <p>
     *        For <code>Dynamic</code> evaluations, cannot determine the target value because it depends on the result
     *        of an intrinsic function, such as a <code>Ref</code> or <code>Fn::GetAtt</code> intrinsic function, when
     *        the stack is updated. For example, if your template includes a reference to a resource that is
     *        conditionally recreated, the value of the reference (the physical ID of the resource) might change,
     *        depending on if the resource is recreated. If the resource is recreated, it will have a new physical ID,
     *        so all references to that resource will also be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationType
     */

    public ResourceChangeDetail withEvaluation(String evaluation) {
        setEvaluation(evaluation);
        return this;
    }

    /**
     * <p>
     * Indicates whether AWS CloudFormation can determine the target value, and whether the target value will change
     * before you execute a change set.
     * </p>
     * <p>
     * For <code>Static</code> evaluations, AWS CloudFormation can determine that the target value will change, and its
     * value. For example, if you directly modify the <code>InstanceType</code> property of an EC2 instance, AWS
     * CloudFormation knows that this property value will change, and its value, so this is a <code>Static</code>
     * evaluation.
     * </p>
     * <p>
     * For <code>Dynamic</code> evaluations, cannot determine the target value because it depends on the result of an
     * intrinsic function, such as a <code>Ref</code> or <code>Fn::GetAtt</code> intrinsic function, when the stack is
     * updated. For example, if your template includes a reference to a resource that is conditionally recreated, the
     * value of the reference (the physical ID of the resource) might change, depending on if the resource is recreated.
     * If the resource is recreated, it will have a new physical ID, so all references to that resource will also be
     * updated.
     * </p>
     * 
     * @param evaluation
     *        Indicates whether AWS CloudFormation can determine the target value, and whether the target value will
     *        change before you execute a change set.</p>
     *        <p>
     *        For <code>Static</code> evaluations, AWS CloudFormation can determine that the target value will change,
     *        and its value. For example, if you directly modify the <code>InstanceType</code> property of an EC2
     *        instance, AWS CloudFormation knows that this property value will change, and its value, so this is a
     *        <code>Static</code> evaluation.
     *        </p>
     *        <p>
     *        For <code>Dynamic</code> evaluations, cannot determine the target value because it depends on the result
     *        of an intrinsic function, such as a <code>Ref</code> or <code>Fn::GetAtt</code> intrinsic function, when
     *        the stack is updated. For example, if your template includes a reference to a resource that is
     *        conditionally recreated, the value of the reference (the physical ID of the resource) might change,
     *        depending on if the resource is recreated. If the resource is recreated, it will have a new physical ID,
     *        so all references to that resource will also be updated.
     * @see EvaluationType
     */

    public void setEvaluation(EvaluationType evaluation) {
        withEvaluation(evaluation);
    }

    /**
     * <p>
     * Indicates whether AWS CloudFormation can determine the target value, and whether the target value will change
     * before you execute a change set.
     * </p>
     * <p>
     * For <code>Static</code> evaluations, AWS CloudFormation can determine that the target value will change, and its
     * value. For example, if you directly modify the <code>InstanceType</code> property of an EC2 instance, AWS
     * CloudFormation knows that this property value will change, and its value, so this is a <code>Static</code>
     * evaluation.
     * </p>
     * <p>
     * For <code>Dynamic</code> evaluations, cannot determine the target value because it depends on the result of an
     * intrinsic function, such as a <code>Ref</code> or <code>Fn::GetAtt</code> intrinsic function, when the stack is
     * updated. For example, if your template includes a reference to a resource that is conditionally recreated, the
     * value of the reference (the physical ID of the resource) might change, depending on if the resource is recreated.
     * If the resource is recreated, it will have a new physical ID, so all references to that resource will also be
     * updated.
     * </p>
     * 
     * @param evaluation
     *        Indicates whether AWS CloudFormation can determine the target value, and whether the target value will
     *        change before you execute a change set.</p>
     *        <p>
     *        For <code>Static</code> evaluations, AWS CloudFormation can determine that the target value will change,
     *        and its value. For example, if you directly modify the <code>InstanceType</code> property of an EC2
     *        instance, AWS CloudFormation knows that this property value will change, and its value, so this is a
     *        <code>Static</code> evaluation.
     *        </p>
     *        <p>
     *        For <code>Dynamic</code> evaluations, cannot determine the target value because it depends on the result
     *        of an intrinsic function, such as a <code>Ref</code> or <code>Fn::GetAtt</code> intrinsic function, when
     *        the stack is updated. For example, if your template includes a reference to a resource that is
     *        conditionally recreated, the value of the reference (the physical ID of the resource) might change,
     *        depending on if the resource is recreated. If the resource is recreated, it will have a new physical ID,
     *        so all references to that resource will also be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationType
     */

    public ResourceChangeDetail withEvaluation(EvaluationType evaluation) {
        this.evaluation = evaluation.toString();
        return this;
    }

    /**
     * <p>
     * The group to which the <code>CausingEntity</code> value belongs. There are five entity groups:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ResourceReference</code> entities are <code>Ref</code> intrinsic functions that refer to resources in the
     * template, such as <code>{ "Ref" : "MyEC2InstanceResource" }</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ParameterReference</code> entities are <code>Ref</code> intrinsic functions that get template parameter
     * values, such as <code>{ "Ref" : "MyPasswordParameter" }</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceAttribute</code> entities are <code>Fn::GetAtt</code> intrinsic functions that get resource
     * attribute values, such as <code>{ "Fn::GetAtt" : [ "MyEC2InstanceResource", "PublicDnsName" ] }</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DirectModification</code> entities are changes that are made directly to the template.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Automatic</code> entities are <code>AWS::CloudFormation::Stack</code> resource types, which are also known
     * as nested stacks. If you made no changes to the <code>AWS::CloudFormation::Stack</code> resource, AWS
     * CloudFormation sets the <code>ChangeSource</code> to <code>Automatic</code> because the nested stack's template
     * might have changed. Changes to a nested stack's template aren't visible to AWS CloudFormation until you run an
     * update on the parent stack.
     * </p>
     * </li>
     * </ul>
     * 
     * @param changeSource
     *        The group to which the <code>CausingEntity</code> value belongs. There are five entity groups:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ResourceReference</code> entities are <code>Ref</code> intrinsic functions that refer to resources
     *        in the template, such as <code>{ "Ref" : "MyEC2InstanceResource" }</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ParameterReference</code> entities are <code>Ref</code> intrinsic functions that get template
     *        parameter values, such as <code>{ "Ref" : "MyPasswordParameter" }</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResourceAttribute</code> entities are <code>Fn::GetAtt</code> intrinsic functions that get resource
     *        attribute values, such as <code>{ "Fn::GetAtt" : [ "MyEC2InstanceResource", "PublicDnsName" ] }</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DirectModification</code> entities are changes that are made directly to the template.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Automatic</code> entities are <code>AWS::CloudFormation::Stack</code> resource types, which are also
     *        known as nested stacks. If you made no changes to the <code>AWS::CloudFormation::Stack</code> resource,
     *        AWS CloudFormation sets the <code>ChangeSource</code> to <code>Automatic</code> because the nested stack's
     *        template might have changed. Changes to a nested stack's template aren't visible to AWS CloudFormation
     *        until you run an update on the parent stack.
     *        </p>
     *        </li>
     * @see ChangeSource
     */

    public void setChangeSource(String changeSource) {
        this.changeSource = changeSource;
    }

    /**
     * <p>
     * The group to which the <code>CausingEntity</code> value belongs. There are five entity groups:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ResourceReference</code> entities are <code>Ref</code> intrinsic functions that refer to resources in the
     * template, such as <code>{ "Ref" : "MyEC2InstanceResource" }</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ParameterReference</code> entities are <code>Ref</code> intrinsic functions that get template parameter
     * values, such as <code>{ "Ref" : "MyPasswordParameter" }</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceAttribute</code> entities are <code>Fn::GetAtt</code> intrinsic functions that get resource
     * attribute values, such as <code>{ "Fn::GetAtt" : [ "MyEC2InstanceResource", "PublicDnsName" ] }</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DirectModification</code> entities are changes that are made directly to the template.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Automatic</code> entities are <code>AWS::CloudFormation::Stack</code> resource types, which are also known
     * as nested stacks. If you made no changes to the <code>AWS::CloudFormation::Stack</code> resource, AWS
     * CloudFormation sets the <code>ChangeSource</code> to <code>Automatic</code> because the nested stack's template
     * might have changed. Changes to a nested stack's template aren't visible to AWS CloudFormation until you run an
     * update on the parent stack.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The group to which the <code>CausingEntity</code> value belongs. There are five entity groups:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ResourceReference</code> entities are <code>Ref</code> intrinsic functions that refer to resources
     *         in the template, such as <code>{ "Ref" : "MyEC2InstanceResource" }</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ParameterReference</code> entities are <code>Ref</code> intrinsic functions that get template
     *         parameter values, such as <code>{ "Ref" : "MyPasswordParameter" }</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ResourceAttribute</code> entities are <code>Fn::GetAtt</code> intrinsic functions that get resource
     *         attribute values, such as <code>{ "Fn::GetAtt" : [ "MyEC2InstanceResource", "PublicDnsName" ] }</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DirectModification</code> entities are changes that are made directly to the template.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Automatic</code> entities are <code>AWS::CloudFormation::Stack</code> resource types, which are
     *         also known as nested stacks. If you made no changes to the <code>AWS::CloudFormation::Stack</code>
     *         resource, AWS CloudFormation sets the <code>ChangeSource</code> to <code>Automatic</code> because the
     *         nested stack's template might have changed. Changes to a nested stack's template aren't visible to AWS
     *         CloudFormation until you run an update on the parent stack.
     *         </p>
     *         </li>
     * @see ChangeSource
     */

    public String getChangeSource() {
        return this.changeSource;
    }

    /**
     * <p>
     * The group to which the <code>CausingEntity</code> value belongs. There are five entity groups:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ResourceReference</code> entities are <code>Ref</code> intrinsic functions that refer to resources in the
     * template, such as <code>{ "Ref" : "MyEC2InstanceResource" }</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ParameterReference</code> entities are <code>Ref</code> intrinsic functions that get template parameter
     * values, such as <code>{ "Ref" : "MyPasswordParameter" }</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceAttribute</code> entities are <code>Fn::GetAtt</code> intrinsic functions that get resource
     * attribute values, such as <code>{ "Fn::GetAtt" : [ "MyEC2InstanceResource", "PublicDnsName" ] }</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DirectModification</code> entities are changes that are made directly to the template.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Automatic</code> entities are <code>AWS::CloudFormation::Stack</code> resource types, which are also known
     * as nested stacks. If you made no changes to the <code>AWS::CloudFormation::Stack</code> resource, AWS
     * CloudFormation sets the <code>ChangeSource</code> to <code>Automatic</code> because the nested stack's template
     * might have changed. Changes to a nested stack's template aren't visible to AWS CloudFormation until you run an
     * update on the parent stack.
     * </p>
     * </li>
     * </ul>
     * 
     * @param changeSource
     *        The group to which the <code>CausingEntity</code> value belongs. There are five entity groups:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ResourceReference</code> entities are <code>Ref</code> intrinsic functions that refer to resources
     *        in the template, such as <code>{ "Ref" : "MyEC2InstanceResource" }</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ParameterReference</code> entities are <code>Ref</code> intrinsic functions that get template
     *        parameter values, such as <code>{ "Ref" : "MyPasswordParameter" }</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResourceAttribute</code> entities are <code>Fn::GetAtt</code> intrinsic functions that get resource
     *        attribute values, such as <code>{ "Fn::GetAtt" : [ "MyEC2InstanceResource", "PublicDnsName" ] }</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DirectModification</code> entities are changes that are made directly to the template.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Automatic</code> entities are <code>AWS::CloudFormation::Stack</code> resource types, which are also
     *        known as nested stacks. If you made no changes to the <code>AWS::CloudFormation::Stack</code> resource,
     *        AWS CloudFormation sets the <code>ChangeSource</code> to <code>Automatic</code> because the nested stack's
     *        template might have changed. Changes to a nested stack's template aren't visible to AWS CloudFormation
     *        until you run an update on the parent stack.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeSource
     */

    public ResourceChangeDetail withChangeSource(String changeSource) {
        setChangeSource(changeSource);
        return this;
    }

    /**
     * <p>
     * The group to which the <code>CausingEntity</code> value belongs. There are five entity groups:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ResourceReference</code> entities are <code>Ref</code> intrinsic functions that refer to resources in the
     * template, such as <code>{ "Ref" : "MyEC2InstanceResource" }</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ParameterReference</code> entities are <code>Ref</code> intrinsic functions that get template parameter
     * values, such as <code>{ "Ref" : "MyPasswordParameter" }</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceAttribute</code> entities are <code>Fn::GetAtt</code> intrinsic functions that get resource
     * attribute values, such as <code>{ "Fn::GetAtt" : [ "MyEC2InstanceResource", "PublicDnsName" ] }</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DirectModification</code> entities are changes that are made directly to the template.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Automatic</code> entities are <code>AWS::CloudFormation::Stack</code> resource types, which are also known
     * as nested stacks. If you made no changes to the <code>AWS::CloudFormation::Stack</code> resource, AWS
     * CloudFormation sets the <code>ChangeSource</code> to <code>Automatic</code> because the nested stack's template
     * might have changed. Changes to a nested stack's template aren't visible to AWS CloudFormation until you run an
     * update on the parent stack.
     * </p>
     * </li>
     * </ul>
     * 
     * @param changeSource
     *        The group to which the <code>CausingEntity</code> value belongs. There are five entity groups:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ResourceReference</code> entities are <code>Ref</code> intrinsic functions that refer to resources
     *        in the template, such as <code>{ "Ref" : "MyEC2InstanceResource" }</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ParameterReference</code> entities are <code>Ref</code> intrinsic functions that get template
     *        parameter values, such as <code>{ "Ref" : "MyPasswordParameter" }</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResourceAttribute</code> entities are <code>Fn::GetAtt</code> intrinsic functions that get resource
     *        attribute values, such as <code>{ "Fn::GetAtt" : [ "MyEC2InstanceResource", "PublicDnsName" ] }</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DirectModification</code> entities are changes that are made directly to the template.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Automatic</code> entities are <code>AWS::CloudFormation::Stack</code> resource types, which are also
     *        known as nested stacks. If you made no changes to the <code>AWS::CloudFormation::Stack</code> resource,
     *        AWS CloudFormation sets the <code>ChangeSource</code> to <code>Automatic</code> because the nested stack's
     *        template might have changed. Changes to a nested stack's template aren't visible to AWS CloudFormation
     *        until you run an update on the parent stack.
     *        </p>
     *        </li>
     * @see ChangeSource
     */

    public void setChangeSource(ChangeSource changeSource) {
        withChangeSource(changeSource);
    }

    /**
     * <p>
     * The group to which the <code>CausingEntity</code> value belongs. There are five entity groups:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ResourceReference</code> entities are <code>Ref</code> intrinsic functions that refer to resources in the
     * template, such as <code>{ "Ref" : "MyEC2InstanceResource" }</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ParameterReference</code> entities are <code>Ref</code> intrinsic functions that get template parameter
     * values, such as <code>{ "Ref" : "MyPasswordParameter" }</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceAttribute</code> entities are <code>Fn::GetAtt</code> intrinsic functions that get resource
     * attribute values, such as <code>{ "Fn::GetAtt" : [ "MyEC2InstanceResource", "PublicDnsName" ] }</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DirectModification</code> entities are changes that are made directly to the template.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Automatic</code> entities are <code>AWS::CloudFormation::Stack</code> resource types, which are also known
     * as nested stacks. If you made no changes to the <code>AWS::CloudFormation::Stack</code> resource, AWS
     * CloudFormation sets the <code>ChangeSource</code> to <code>Automatic</code> because the nested stack's template
     * might have changed. Changes to a nested stack's template aren't visible to AWS CloudFormation until you run an
     * update on the parent stack.
     * </p>
     * </li>
     * </ul>
     * 
     * @param changeSource
     *        The group to which the <code>CausingEntity</code> value belongs. There are five entity groups:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ResourceReference</code> entities are <code>Ref</code> intrinsic functions that refer to resources
     *        in the template, such as <code>{ "Ref" : "MyEC2InstanceResource" }</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ParameterReference</code> entities are <code>Ref</code> intrinsic functions that get template
     *        parameter values, such as <code>{ "Ref" : "MyPasswordParameter" }</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ResourceAttribute</code> entities are <code>Fn::GetAtt</code> intrinsic functions that get resource
     *        attribute values, such as <code>{ "Fn::GetAtt" : [ "MyEC2InstanceResource", "PublicDnsName" ] }</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DirectModification</code> entities are changes that are made directly to the template.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Automatic</code> entities are <code>AWS::CloudFormation::Stack</code> resource types, which are also
     *        known as nested stacks. If you made no changes to the <code>AWS::CloudFormation::Stack</code> resource,
     *        AWS CloudFormation sets the <code>ChangeSource</code> to <code>Automatic</code> because the nested stack's
     *        template might have changed. Changes to a nested stack's template aren't visible to AWS CloudFormation
     *        until you run an update on the parent stack.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeSource
     */

    public ResourceChangeDetail withChangeSource(ChangeSource changeSource) {
        this.changeSource = changeSource.toString();
        return this;
    }

    /**
     * <p>
     * The identity of the entity that triggered this change. This entity is a member of the group that is specified by
     * the <code>ChangeSource</code> field. For example, if you modified the value of the <code>KeyPairName</code>
     * parameter, the <code>CausingEntity</code> is the name of the parameter (<code>KeyPairName</code>).
     * </p>
     * <p>
     * If the <code>ChangeSource</code> value is <code>DirectModification</code>, no value is given for
     * <code>CausingEntity</code>.
     * </p>
     * 
     * @param causingEntity
     *        The identity of the entity that triggered this change. This entity is a member of the group that is
     *        specified by the <code>ChangeSource</code> field. For example, if you modified the value of the
     *        <code>KeyPairName</code> parameter, the <code>CausingEntity</code> is the name of the parameter (
     *        <code>KeyPairName</code>).</p>
     *        <p>
     *        If the <code>ChangeSource</code> value is <code>DirectModification</code>, no value is given for
     *        <code>CausingEntity</code>.
     */

    public void setCausingEntity(String causingEntity) {
        this.causingEntity = causingEntity;
    }

    /**
     * <p>
     * The identity of the entity that triggered this change. This entity is a member of the group that is specified by
     * the <code>ChangeSource</code> field. For example, if you modified the value of the <code>KeyPairName</code>
     * parameter, the <code>CausingEntity</code> is the name of the parameter (<code>KeyPairName</code>).
     * </p>
     * <p>
     * If the <code>ChangeSource</code> value is <code>DirectModification</code>, no value is given for
     * <code>CausingEntity</code>.
     * </p>
     * 
     * @return The identity of the entity that triggered this change. This entity is a member of the group that is
     *         specified by the <code>ChangeSource</code> field. For example, if you modified the value of the
     *         <code>KeyPairName</code> parameter, the <code>CausingEntity</code> is the name of the parameter (
     *         <code>KeyPairName</code>).</p>
     *         <p>
     *         If the <code>ChangeSource</code> value is <code>DirectModification</code>, no value is given for
     *         <code>CausingEntity</code>.
     */

    public String getCausingEntity() {
        return this.causingEntity;
    }

    /**
     * <p>
     * The identity of the entity that triggered this change. This entity is a member of the group that is specified by
     * the <code>ChangeSource</code> field. For example, if you modified the value of the <code>KeyPairName</code>
     * parameter, the <code>CausingEntity</code> is the name of the parameter (<code>KeyPairName</code>).
     * </p>
     * <p>
     * If the <code>ChangeSource</code> value is <code>DirectModification</code>, no value is given for
     * <code>CausingEntity</code>.
     * </p>
     * 
     * @param causingEntity
     *        The identity of the entity that triggered this change. This entity is a member of the group that is
     *        specified by the <code>ChangeSource</code> field. For example, if you modified the value of the
     *        <code>KeyPairName</code> parameter, the <code>CausingEntity</code> is the name of the parameter (
     *        <code>KeyPairName</code>).</p>
     *        <p>
     *        If the <code>ChangeSource</code> value is <code>DirectModification</code>, no value is given for
     *        <code>CausingEntity</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceChangeDetail withCausingEntity(String causingEntity) {
        setCausingEntity(causingEntity);
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
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getEvaluation() != null)
            sb.append("Evaluation: ").append(getEvaluation()).append(",");
        if (getChangeSource() != null)
            sb.append("ChangeSource: ").append(getChangeSource()).append(",");
        if (getCausingEntity() != null)
            sb.append("CausingEntity: ").append(getCausingEntity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceChangeDetail == false)
            return false;
        ResourceChangeDetail other = (ResourceChangeDetail) obj;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getEvaluation() == null ^ this.getEvaluation() == null)
            return false;
        if (other.getEvaluation() != null && other.getEvaluation().equals(this.getEvaluation()) == false)
            return false;
        if (other.getChangeSource() == null ^ this.getChangeSource() == null)
            return false;
        if (other.getChangeSource() != null && other.getChangeSource().equals(this.getChangeSource()) == false)
            return false;
        if (other.getCausingEntity() == null ^ this.getCausingEntity() == null)
            return false;
        if (other.getCausingEntity() != null && other.getCausingEntity().equals(this.getCausingEntity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getEvaluation() == null) ? 0 : getEvaluation().hashCode());
        hashCode = prime * hashCode + ((getChangeSource() == null) ? 0 : getChangeSource().hashCode());
        hashCode = prime * hashCode + ((getCausingEntity() == null) ? 0 : getCausingEntity().hashCode());
        return hashCode;
    }

    @Override
    public ResourceChangeDetail clone() {
        try {
            return (ResourceChangeDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
