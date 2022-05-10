import { ReactComponent as StarFull } from "assets/img/star_full.svg";
import { ReactComponent as StarHalf } from "assets/img/star_half.svg";
import { ReactComponent as StarEmpty } from "assets/img/star_empty.svg";
import "./styles.css";

function MovieStar() {
  return (
    <div className="dsmovie-stars-container">
      <StarFull />
      <StarFull />
      <StarFull />
      <StarHalf />
      <StarEmpty />
    </div>
  );
}

export default MovieStar;
