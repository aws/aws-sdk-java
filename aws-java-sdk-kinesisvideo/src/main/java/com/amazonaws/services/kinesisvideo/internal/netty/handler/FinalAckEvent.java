/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideo.internal.netty.handler;

import com.amazonaws.services.kinesisvideo.PutMediaAckResponseHandler;
import com.amazonaws.services.kinesisvideo.model.AckEvent;

/**
 * Special empty {@link AckEvent} used to signify all acks have been received. When
 * this is received by {@link DeliverAckHandler} then {@link PutMediaAckResponseHandler#onComplete()}
 * will be called.
 *
 * <p>Note that this will not actually be a valid {@link AckEvent}. I.E there will be no data in this object,
 * it's just a marker to indicate all Acks have been received.</p>
 */
final class FinalAckEvent extends AckEvent {
}
