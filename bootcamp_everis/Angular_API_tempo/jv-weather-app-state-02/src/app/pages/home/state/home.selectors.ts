import { createFeatureSelector, createSelector } from '@ngrx/store';
import { HomeState } from './home.reducer';

export const selectHomeState = createFeatureSelector('home');

export const selectCurrentWeather = createSelector(
    selectHomeState,
    (homestate: HomeState) => homestate.entity,
);
export const selectCurrentWeatherLoading = createSelector(
    selectHomeState,
    (homestate: HomeState) => homestate.loading,
)
export const selectCurrentWeatherError = createSelector(
    selectHomeState,
    (homestate: HomeState) => homestate.error
)

