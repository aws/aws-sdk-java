/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import javax.annotation.Generated;

/**
 * <p>
 * Parameter Store retains the 100 most recently created versions of a parameter. After this number of versions has been
 * created, Parameter Store deletes the oldest version when a new one is created. However, if the oldest version has a
 * <i>label</i> attached to it, Parameter Store won't delete the version and instead presents this error message:
 * </p>
 * <p>
 * <code>An error occurred (ParameterMaxVersionLimitExceeded) when calling the PutParameter operation: You attempted to create a new version of <i>parameter-name</i> by calling the PutParameter API with the overwrite flag. Version <i>version-number</i>, the oldest version, can't be deleted because it has a label associated with it. Move the label to another version of the parameter, and try again.</code>
 * </p>
 * <p>
 * This safeguard is to prevent parameter versions with mission critical labels assigned to them from being deleted. To
 * continue creating new parameters, first move the label from the oldest version of the parameter to a newer one for
 * use in your operations. For information about moving parameter labels, see <a href=
 * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-labels.html#sysman-paramstore-labels-console-move"
 * >Move a parameter label (console)</a> or <a href=
 * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-labels.html#sysman-paramstore-labels-cli-move"
 * >Move a parameter label (CLI)</a> in the <i>Amazon Web Services Systems Manager User Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterMaxVersionLimitExceededException extends com.amazonaws.services.simplesystemsmanagement.model.AWSSimpleSystemsManagementException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ParameterMaxVersionLimitExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ParameterMaxVersionLimitExceededException(String message) {
        super(message);
    }

}
