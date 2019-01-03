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
package com.amazonaws.auth.policy.actions;

import javax.annotation.Generated;

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for Amazon Polly.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum PollyActions implements Action {

    /** Represents any action executed on Amazon Polly. */
    AllPollyActions("polly:*"),

    /** Action for the DeleteLexicon operation. */
    DeleteLexicon("polly:DeleteLexicon"),
    /** Action for the DescribeVoices operation. */
    DescribeVoices("polly:DescribeVoices"),
    /** Action for the GetLexicon operation. */
    GetLexicon("polly:GetLexicon"),
    /** Action for the GetSpeechSynthesisTask operation. */
    GetSpeechSynthesisTask("polly:GetSpeechSynthesisTask"),
    /** Action for the ListLexicons operation. */
    ListLexicons("polly:ListLexicons"),
    /** Action for the ListSpeechSynthesisTasks operation. */
    ListSpeechSynthesisTasks("polly:ListSpeechSynthesisTasks"),
    /** Action for the PutLexicon operation. */
    PutLexicon("polly:PutLexicon"),
    /** Action for the StartSpeechSynthesisTask operation. */
    StartSpeechSynthesisTask("polly:StartSpeechSynthesisTask"),
    /** Action for the SynthesizeSpeech operation. */
    SynthesizeSpeech("polly:SynthesizeSpeech"),

    ;

    private final String action;

    private PollyActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
