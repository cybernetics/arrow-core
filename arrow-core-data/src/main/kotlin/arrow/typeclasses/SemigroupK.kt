package arrow.typeclasses

import arrow.Kind

/**
 * ank_macro_hierarchy(arrow.typeclasses.SemigroupK)
 */
interface SemigroupK<F> {

  /**
   * Combine two F<A> values.
   */
  fun <A> Kind<F, A>.combineK(y: Kind<F, A>): Kind<F, A>

  /**
   * Given a type A, create a concrete Semigroup<F<A>>.
   */
  fun <A> algebra(): Semigroup<Kind<F, A>> = Semigroup<Kind<F, A>> { b: Kind<F, A> -> this.combineK(b) }
}
