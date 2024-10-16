import {Routes} from '@angular/router';
import {HomePageComponent} from "./components/home-page/home-page.component";
import {AddProductComponent} from "./components/add-product/add-product.component";

export const routes: Routes = [
  {path: '', component: HomePageComponent},
  {path: 'add-product', component: AddProductComponent}
];