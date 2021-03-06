// Copyright 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
// SPDX-License-Identifier: Apache-2.0

package software.aws.toolkits.core.utils.test

import org.assertj.core.api.ObjectAssert

@Suppress("UNCHECKED_CAST")
val <T : Any> ObjectAssert<T?>.notNull: ObjectAssert<T>
    get() = this.isNotNull as ObjectAssert<T>
